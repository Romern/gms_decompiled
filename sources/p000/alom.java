package p000;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: alom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alom implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f73956a;

    /* renamed from: b */
    final /* synthetic */ amqr f73957b;

    /* renamed from: c */
    final /* synthetic */ alon f73958c;

    public alom(alon alon, String str, amqr amqr) {
        this.f73958c = alon;
        this.f73956a = str;
        this.f73957b = amqr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ca A[SYNTHETIC, Splitter:B:81:0x00ca] */
    public final void run() {
        String str;
        String str2;
        alow alow;
        ciqq ciqq;
        synchronized (this.f73958c.f73960a) {
            if (this.f73958c.f73962c != null) {
                String a = amqs.m63193a(this.f73956a);
                cipv cipv = null;
                try {
                    alox a2 = this.f73958c.f73962c.mo40626a(a);
                    if (a2 == null) {
                        cauw b = this.f73958c.f73962c.f73994a.mo74942b(a);
                        if (b != null) {
                            alow = new alow(b);
                        } else {
                            alow = null;
                        }
                        if (alow != null) {
                            cauw cauw = alow.f73992a;
                            synchronized (cauw.f176084d) {
                                caux caux = cauw.f176081a;
                                if (caux.f176090f == cauw) {
                                    if (!caux.f176089e) {
                                        cauw.f176082b[0] = true;
                                    }
                                    try {
                                        ciqq = new cauv(cauw, cauw.f176084d.f176096b.mo75171a(caux.f176088d[0]));
                                    } catch (FileNotFoundException e) {
                                        ciqq = cauz.f176095i;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            cipv = ciqh.m150827a(ciqq);
                            try {
                                cipv.mo86289a(this.f73957b.mo73642k());
                                cauw cauw2 = alow.f73992a;
                                synchronized (cauw2.f176084d) {
                                    if (!cauw2.f176083c) {
                                        cauw2.f176084d.mo74940a(cauw2, true);
                                    } else {
                                        cauw2.f176084d.mo74940a(cauw2, false);
                                        cauw2.f176084d.mo74941a(cauw2.f176081a);
                                    }
                                }
                                cipv.close();
                            } catch (IOException e2) {
                                e = e2;
                            } catch (Throwable th) {
                                th = th;
                                if (cipv != null) {
                                }
                                throw th;
                            }
                        }
                    } else {
                        a2.mo40625a().close();
                    }
                    if (cipv != null) {
                        try {
                            cipv.close();
                        } catch (IOException e3) {
                            e = e3;
                            str2 = "AvatarCacheImpl";
                            str = "put: Error closing outputStream.";
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    try {
                        Log.e("AvatarCacheImpl", "put: Error adding byte[] to disk cache.", e);
                        if (cipv != null) {
                            try {
                                cipv.close();
                            } catch (IOException e5) {
                                e = e5;
                                str2 = "AvatarCacheImpl";
                                str = "put: Error closing outputStream.";
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cipv != null) {
                            try {
                                cipv.close();
                            } catch (IOException e6) {
                                Log.e("AvatarCacheImpl", "put: Error closing outputStream.", e6);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (cipv != null) {
                    }
                    throw th;
                }
            }
        }
        Log.e(str2, str, e);
    }
}
