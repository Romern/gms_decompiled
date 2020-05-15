package com.google.android.gms.ads.internal.common;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.common.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0355a implements Callable {
    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
