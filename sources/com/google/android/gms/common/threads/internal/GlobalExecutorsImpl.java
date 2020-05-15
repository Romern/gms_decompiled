package com.google.android.gms.common.threads.internal;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GlobalExecutorsImpl {

    /* renamed from: a */
    private static final ThreadPoolExecutor f30392a = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new sua("lowpool", 10));

    /* renamed from: b */
    private static final ThreadPoolExecutor f30393b = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new sua("highpool", 9));

    private GlobalExecutorsImpl() {
    }

    public static ThreadPoolExecutor getPool(int i) {
        if (i == 9) {
            return f30393b;
        }
        if (i == 10) {
            return f30392a;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unexpected priority ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
