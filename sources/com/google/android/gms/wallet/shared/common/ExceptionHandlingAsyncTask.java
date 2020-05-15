package com.google.android.gms.wallet.shared.common;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.wallet.dynamite.logging.C1676b;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ExceptionHandlingAsyncTask extends AsyncTask {

    /* renamed from: f */
    protected final Context f110422f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo52117a(Object... objArr);

    /* access modifiers changed from: protected */
    public final Object doInBackground(Object... objArr) {
        try {
            return mo52117a(objArr);
        } catch (Throwable th) {
            C1676b.m93930a(this.f110422f, th, null);
            return null;
        }
    }

    public ExceptionHandlingAsyncTask(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f110422f = applicationContext != null ? applicationContext : context;
    }
}
