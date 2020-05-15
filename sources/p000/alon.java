package p000;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: alon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alon implements alok {

    /* renamed from: h */
    private static alon f73959h;

    /* renamed from: a */
    public final Object f73960a = new Object();

    /* renamed from: b */
    public final int f73961b;

    /* renamed from: c */
    public aloy f73962c;

    /* renamed from: d */
    public boolean f73963d = true;

    /* renamed from: e */
    public File f73964e;

    /* renamed from: f */
    private final C1231nx f73965f;

    /* renamed from: g */
    private final int f73966g;

    private alon(File file) {
        this.f73964e = file;
        amig.m62939a();
        this.f73966g = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83456j()).intValue();
        amig.m62939a();
        this.f73961b = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83455i()).intValue();
        this.f73965f = new C1231nx(this.f73966g);
        new soa(9, new alol(this)).start();
    }

    /* renamed from: a */
    public static synchronized alon m61426a(Context context) {
        alon alon;
        String str;
        synchronized (alon.class) {
            if (f73959h == null) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    if (Environment.isExternalStorageRemovable()) {
                        str = context.getCacheDir().getPath();
                        String str2 = File.separator;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 11);
                        sb.append(str);
                        sb.append(str2);
                        sb.append("avatarCache");
                        f73959h = new alon(new File(sb.toString()));
                    }
                }
                str = context.getExternalCacheDir().getPath();
                String str22 = File.separator;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str22).length() + 11);
                sb2.append(str);
                sb2.append(str22);
                sb2.append("avatarCache");
                f73959h = new alon(new File(sb2.toString()));
            }
            alon = f73959h;
        }
        return alon;
    }

    /* renamed from: a */
    public final void mo40617a(String str, byte[] bArr, long j) {
        if (str != null) {
            bxvd da = amqr.f75772d.mo74144da();
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amqr amqr = (amqr) da.f164949b;
            a.getClass();
            amqr.f75774a |= 1;
            amqr.f75775b = a;
            long currentTimeMillis = System.currentTimeMillis() + j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amqr amqr2 = (amqr) da.f164949b;
            amqr2.f75774a |= 2;
            amqr2.f75776c = currentTimeMillis;
            amqr amqr3 = (amqr) da.mo74062i();
            C1231nx nxVar = this.f73965f;
            if (nxVar != null) {
                nxVar.mo15547a(str, amqr3);
            }
            new soa(9, new alom(this, str, amqr3)).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[SYNTHETIC, Splitter:B:38:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007e A[SYNTHETIC, Splitter:B:49:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008f A[SYNTHETIC, Splitter:B:59:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00eb A[RETURN] */
    /* renamed from: a */
    public final byte[] mo40618a(String str) {
        amqr amqr;
        boolean z;
        byte[] bArr;
        amqr amqr2;
        IOException e;
        ciqr ciqr;
        C1231nx nxVar = this.f73965f;
        ciqr ciqr2 = null;
        if (nxVar != null) {
            amqr = (amqr) nxVar.mo15546a(str);
        } else {
            amqr = null;
        }
        if (amqr == null) {
            String a = amqs.m63193a(str);
            synchronized (this.f73960a) {
                while (this.f73963d) {
                    try {
                        this.f73960a.wait();
                    } catch (InterruptedException e2) {
                        Log.e("AvatarCacheImpl", "getFromDiskCache: Error obtaining lock for disk cache.", e2);
                    }
                }
                aloy aloy = this.f73962c;
                if (aloy != null) {
                    try {
                        alox a2 = aloy.mo40626a(a);
                        if (a2 != null) {
                            ciqr = a2.mo40625a();
                            if (ciqr != null) {
                                try {
                                    cipw a3 = ciqh.m150828a(ciqr);
                                    ((ciqm) a3).f191247a.mo86286a(((ciqm) a3).f191248b);
                                    bArr = ((ciqm) a3).f191247a.mo86327m();
                                } catch (IOException e3) {
                                    e = e3;
                                    try {
                                        Log.e("AvatarCacheImpl", "getBitmapFromDiskCache: Error getting byte[] from disk cache.", e);
                                        if (ciqr != null) {
                                        }
                                        bArr = null;
                                        if (bArr != null) {
                                        }
                                        z = false;
                                        if (amqr == null) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        ciqr2 = ciqr;
                                        if (ciqr2 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    ciqr2 = ciqr;
                                    if (ciqr2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                bArr = null;
                            }
                        } else {
                            ciqr = null;
                            bArr = null;
                        }
                        if (ciqr != null) {
                            try {
                                ciqr.close();
                            } catch (IOException e4) {
                                Log.e("AvatarCacheImpl", "getBitmapFromDiskCache: Error closing input stream.", e4);
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        ciqr = null;
                        Log.e("AvatarCacheImpl", "getBitmapFromDiskCache: Error getting byte[] from disk cache.", e);
                        if (ciqr != null) {
                            try {
                                ciqr.close();
                                bArr = null;
                            } catch (IOException e6) {
                                Log.e("AvatarCacheImpl", "getBitmapFromDiskCache: Error closing input stream.", e6);
                                bArr = null;
                                if (bArr != null) {
                                }
                                z = false;
                                if (amqr == null) {
                                }
                            }
                            if (bArr != null) {
                            }
                            z = false;
                            if (amqr == null) {
                            }
                        }
                        bArr = null;
                        if (bArr != null) {
                        }
                        z = false;
                        if (amqr == null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (ciqr2 != null) {
                            try {
                                ciqr2.close();
                            } catch (IOException e7) {
                                Log.e("AvatarCacheImpl", "getBitmapFromDiskCache: Error closing input stream.", e7);
                            }
                        }
                        throw th;
                    }
                } else {
                    bArr = null;
                }
            }
            if (bArr != null) {
                try {
                    amqr2 = (amqr) bxvk.m124016a(amqr.f75772d, bArr, bxus.m123744c());
                } catch (bxwf e8) {
                    Log.e("AvatarCacheImpl", "getFromDiskCache: Error parsing from byte[].", e8);
                    amqr2 = null;
                }
            } else {
                amqr2 = null;
            }
            z = false;
        } else {
            z = true;
        }
        if (amqr == null) {
            return null;
        }
        if (amqr.f75776c < System.currentTimeMillis()) {
            this.f73965f.mo15552b(str);
            try {
                this.f73962c.f73994a.mo74944c(amqs.m63193a(str));
            } catch (IOException e9) {
            }
            return null;
        }
        if (z) {
            this.f73965f.mo15547a(str, amqr);
        }
        return amqr.f75775b.mo73780k();
    }
}
