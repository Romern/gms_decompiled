package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wearable.node.A2AEncryption$PairingReceiver;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: axua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axua {

    /* renamed from: a */
    public static final byte[] f96354a = {67, 79, 78, 70, 73, 82, 77};

    /* renamed from: b */
    public static final byte[] f96355b = {67, 76, 73, 69, 78, 84};

    /* renamed from: c */
    public static final byte[] f96356c = {83, 69, 82, 86, 69, 82};

    /* renamed from: g */
    private static final byte[] f96357g = {82, 69, 83, 85, 77, 69};

    /* renamed from: d */
    public byqy f96358d;

    /* renamed from: e */
    public final axtz f96359e;

    /* renamed from: f */
    public final ayar f96360f;

    /* renamed from: h */
    private boolean f96361h;

    public axua(axtz axtz, ayar ayar) {
        this.f96359e = axtz;
        this.f96360f = ayar;
    }

    /* renamed from: a */
    public static ayev m83211a(byte[] bArr, Boolean bool, int i) {
        bxvd da = ayev.f97376n.mo74144da();
        bxvd da2 = ayer.f97351f.mo74144da();
        ByteString a = ByteString.m123261a(bArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ayer ayer = (ayer) da2.f164949b;
        a.getClass();
        ayer.f97353a |= 1;
        ayer.f97354b = a;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayer ayer2 = (ayer) da2.f164949b;
            ayer2.f97353a |= 4;
            ayer2.f97356d = booleanValue;
        }
        if (i != 0) {
            ayer ayer3 = (ayer) da2.f164949b;
            ayer3.f97357e = i - 1;
            ayer3.f97353a |= 8;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayev ayev = (ayev) da.f164949b;
        ayer ayer4 = (ayer) da2.mo74062i();
        ayer4.getClass();
        ayev.f97383f = ayer4;
        ayev.f97378a |= 16;
        return (ayev) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo53553b(byte[] bArr) {
        this.f96359e.mo53548a(m83211a(bArr, (Boolean) null, 0), this);
    }

    /* renamed from: a */
    public static final void m83212a(Context context, Intent intent, boolean z) {
        if (intent.getStringExtra("code") != null) {
            intent.putExtra("success", z);
            intent.setComponent(new ComponentName("com.google.android.apps.wearable.settings", "com.google.android.clockwork.settings.A2ABroadcastReceiver"));
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    static boolean m83213a(byte[] bArr, byqy byqy, byqy byqy2, byte[] bArr2) {
        int length = bArr.length;
        if (length == 32) {
            return MessageDigest.isEqual(bArr, m83215a(byqy, byqy2, bArr2));
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("failing because digest.length is ");
        sb.append(length);
        Log.e("A2AEncryption", sb.toString());
        return false;
    }

    /* renamed from: a */
    public static byte[] m83214a(ayev ayev) {
        if ((ayev.f97378a & 16) == 0) {
            return null;
        }
        ayer ayer = ayev.f97383f;
        if (ayer == null) {
            ayer = ayer.f97351f;
        }
        return ayer.f97354b.getKey();
    }

    /* renamed from: a */
    static byte[] m83215a(byqy byqy, byqy byqy2, byte[] bArr) {
        try {
            byte[] a = byqy.mo74475a();
            byte[] a2 = byqy2.mo74475a();
            if (a == null && a2 == null) {
                a = new byte[0];
            } else if (a == null) {
                a = a2;
            } else if (a2 != null) {
                int length = a.length;
                int length2 = a2.length;
                byte[] bArr2 = new byte[(length + length2)];
                System.arraycopy(a, 0, bArr2, 0, length);
                System.arraycopy(a2, 0, bArr2, length, length2);
                a = bArr2;
            }
            return byst.m125284a(new SecretKeySpec(a, ""), f96357g, bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo53549a(String str) {
        if (this.f96361h) {
            mo53553b(new byte[0]);
        }
        Log.e("A2AEncryption", str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axua.a(byte[], java.lang.Boolean, int):ayev
     arg types: [byte[], int, int]
     candidates:
      axua.a(android.content.Context, android.content.Intent, boolean):void
      axua.a(byqy, byqy, byte[]):byte[]
      axua.a(android.content.Context, boolean, android.content.Intent):boolean
      axua.a(byte[], java.lang.Boolean, int):ayev */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0114, code lost:
        if (r10.f110969a.booleanValue() == false) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086 A[Catch:{ all -> 0x0117, byrq | bysb -> 0x0138, IOException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[Catch:{ all -> 0x0117, byrq | bysb -> 0x0138, IOException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130 A[Catch:{ all -> 0x0117, byrq | bysb -> 0x0138, IOException -> 0x0136 }] */
    /* renamed from: a */
    public final boolean mo53550a(Context context, boolean z, Intent intent) {
        int i;
        byqy c;
        A2AEncryption$PairingReceiver a2AEncryption$PairingReceiver;
        this.f96358d = null;
        this.f96361h = false;
        try {
            byse a = byse.m125241a(bysc.P256_SHA512);
            Log.i("A2AEncryption", "sending init");
            byte[] a2 = a.mo74493a();
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            this.f96359e.mo53548a(m83211a(a2, (Boolean) true, i), this);
            Log.i("A2AEncryption", "reading response");
            ayev a3 = this.f96359e.mo53547a(this);
            byte[] a4 = m83214a(a3);
            ayer ayer = a3.f97383f;
            if (ayer == null) {
                ayer = ayer.f97351f;
            }
            int a5 = ayeq.m83893a(ayer.f97357e);
            if (a5 == 0) {
                a5 = 1;
            }
            if (a5 != 2) {
                if (a5 != 3) {
                    if (a4 == null) {
                        try {
                            Log.e("A2AEncryption", "Missing crypto negotiation response");
                        } catch (byrq | bysb e) {
                            Log.e("A2AEncryption", "Alert or handshake exception establishing encryption");
                            try {
                                mo53553b(new byte[0]);
                            } catch (IOException e2) {
                            }
                            return z;
                        } catch (IOException e3) {
                            e = e3;
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                            sb.append("IOException during encryption ");
                            sb.append(valueOf);
                            Log.e("A2AEncryption", sb.toString());
                            return z;
                        } catch (Throwable th) {
                            context.unregisterReceiver(a2AEncryption$PairingReceiver);
                            throw th;
                        }
                    }
                    a.mo74492a(a4);
                    Log.i("A2AEncryption", "sending final");
                    mo53553b(a.mo74493a());
                    String encodeToString = Base64.encodeToString(a.mo74494a(16), 3);
                    if (z) {
                        if (context != null) {
                            intent.putExtra("code", encodeToString);
                            Log.i("A2AEncryption", "Asking user to approve");
                            Intent intent2 = new Intent("com.google.android.clockwork.A2APairing");
                            intent2.setComponent(new ComponentName("com.google.android.apps.wearable.settings", "com.google.android.clockwork.settings.A2ABroadcastReceiver"));
                            intent2.putExtra("code", encodeToString);
                            intent2.addFlags(268435456);
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.clockwork.A2AReject");
                            intentFilter.addAction("com.google.android.clockwork.A2AAccept");
                            Semaphore semaphore = new Semaphore(0);
                            a2AEncryption$PairingReceiver = new A2AEncryption$PairingReceiver(semaphore, encodeToString);
                            context.registerReceiver(a2AEncryption$PairingReceiver, intentFilter);
                            Intent intent3 = new Intent("com.google.android.clockwork.A2AAccept");
                            intent3.putExtra("code", encodeToString);
                            intent3.setPackage(context.getPackageName());
                            Intent intent4 = new Intent("com.google.android.clockwork.A2AReject");
                            intent4.putExtra("code", encodeToString);
                            intent4.setPackage(context.getPackageName());
                            intent2.putExtra("accept", PendingIntent.getBroadcast(context, 0, intent3, 268435456));
                            intent2.putExtra("reject", PendingIntent.getBroadcast(context, 0, intent4, 268435456));
                            context.sendBroadcast(intent2);
                            try {
                                if (!semaphore.tryAcquire(30, TimeUnit.SECONDS)) {
                                    Log.i("A2AEncryption", "Approval timed out");
                                    context.unregisterReceiver(a2AEncryption$PairingReceiver);
                                    return false;
                                }
                                context.unregisterReceiver(a2AEncryption$PairingReceiver);
                            } catch (InterruptedException e4) {
                                Log.e("A2AEncryption", "Interrupted exception in userApprovesOfCode()");
                            }
                        }
                    }
                    a.mo74495b();
                    c = a.mo74496c();
                    this.f96358d = c;
                    if (c == null) {
                        Log.e("A2AEncryption", "toConnectionContext() returned null session");
                    }
                    return z;
                }
            }
            this.f96361h = true;
            if (!z) {
                z = false;
            } else {
                z = a5 == 2;
            }
            if (a4 == null) {
            }
            a.mo74492a(a4);
            Log.i("A2AEncryption", "sending final");
            mo53553b(a.mo74493a());
            String encodeToString2 = Base64.encodeToString(a.mo74494a(16), 3);
            if (z) {
            }
            a.mo74495b();
            c = a.mo74496c();
            this.f96358d = c;
            if (c == null) {
            }
            return z;
        } catch (byrq | bysb e5) {
            Log.e("A2AEncryption", "Alert or handshake exception establishing encryption");
            mo53553b(new byte[0]);
            return z;
        } catch (IOException e6) {
            e = e6;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
            sb2.append("IOException during encryption ");
            sb2.append(valueOf2);
            Log.e("A2AEncryption", sb2.toString());
            return z;
        }
    }

    /* renamed from: a */
    public final byte[] mo53551a() {
        byte[] a = m83214a(this.f96359e.mo53547a(this));
        if (a != null) {
            return a;
        }
        throw new IOException("Missing crypto negotiation response");
    }

    /* renamed from: a */
    public final byte[] mo53552a(byte[] bArr) {
        try {
            return this.f96358d.mo74478b(bArr);
        } catch (SignatureException e) {
            throw new IOException(e);
        }
    }
}
