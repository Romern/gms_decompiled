package p000;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: fle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fle extends fkj {

    /* renamed from: a */
    public volatile String f16848a;

    /* renamed from: b */
    public Future f16849b;

    protected fle(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
    }

    /* renamed from: b */
    public final String mo11000b() {
        String str;
        mo10954t();
        synchronized (this) {
            if (this.f16848a == null) {
                this.f16849b = mo10944i().mo10885a(new flc(this));
            }
            Future future = this.f16849b;
            if (future != null) {
                try {
                    this.f16848a = (String) future.get();
                } catch (InterruptedException e) {
                    mo10934d("ClientId loading or generation was interrupted", e);
                    this.f16848a = "0";
                } catch (ExecutionException e2) {
                    mo10938e("Failed to load or generate client id", e2);
                    this.f16848a = "0";
                }
                if (this.f16848a == null) {
                    this.f16848a = "0";
                }
                mo10926a("Loaded clientId", this.f16848a);
                this.f16849b = null;
            }
            str = this.f16848a;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e A[SYNTHETIC, Splitter:B:32:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006a A[SYNTHETIC, Splitter:B:40:0x006a] */
    /* renamed from: c */
    public final String mo11001c() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context context = mo10944i().f16707b;
            sdo.m34977c(lowerCase);
            sdo.m34973b("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                mo10926a("Storing clientId", lowerCase);
                fileOutputStream = context.openFileOutput("gaClientId", 0);
                try {
                    fileOutputStream.write(lowerCase.getBytes());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            mo10938e("Failed to close clientId writing stream", e);
                        }
                    }
                    return lowerCase;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    try {
                        mo10938e("Error creating clientId file", e);
                        if (fileOutputStream != null) {
                        }
                        return "0";
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        mo10938e("Error writing to clientId file", e);
                        if (fileOutputStream != null) {
                        }
                        return "0";
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                mo10938e("Failed to close clientId writing stream", e4);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
                mo10938e("Failed to close clientId writing stream", e);
                return "0";
            } catch (FileNotFoundException e5) {
                e = e5;
                mo10938e("Error creating clientId file", e);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e6) {
                        e = e6;
                    }
                }
                return "0";
            } catch (IOException e7) {
                e = e7;
                mo10938e("Error writing to clientId file", e);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e8) {
                        e = e8;
                    }
                }
                return "0";
            }
        } catch (Exception e9) {
            mo10938e("Error saving clientId file", e9);
            return "0";
        }
    }
}
