package com.kevin.data.collect.samples;

import static org.mockito.Mockito.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.Test;

/**
 * @author wangyong
 */
public class CompletableFutureTest {


  @Test
  public void runAsyncTest() throws ExecutionException, InterruptedException {
    CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }).thenRunAsync(() -> {
      System.out.println("1");
    }).thenRunAsync(() -> {
      System.out.println("2");
    }).thenRunAsync(() -> {
      System.out.println("3");
    });

    CompletableFuture future2 = CompletableFuture.runAsync(()->{
      try {
        Thread.sleep(2000);
        System.out.println("future2执行完毕");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    CompletableFuture<Void> future = CompletableFuture.allOf(future1, future2)
        .thenRun(() -> {
          System.out.println("所有future都执行完毕");
        })

        ;

    future.get();
  }


}
