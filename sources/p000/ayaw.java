package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

/* renamed from: ayaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayaw implements ayjm {

    /* renamed from: a */
    public final String f96988a;

    /* renamed from: b */
    public final Context f96989b;

    /* renamed from: c */
    public final axys f96990c;

    /* renamed from: d */
    final Collection f96991d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public final Collection f96992e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    public final ArrayList f96993f = new ArrayList();

    /* renamed from: g */
    final Deque f96994g = new ArrayDeque();

    /* renamed from: h */
    final qxh f96995h;

    /* renamed from: i */
    public volatile axwi f96996i;

    /* renamed from: j */
    private final ayav f96997j;

    /* renamed from: k */
    private final axzt f96998k;

    public ayaw(Context context, String str, axzt axzt, axys axys) {
        this.f96989b = context;
        this.f96988a = str;
        this.f96998k = axzt;
        this.f96990c = axys;
        HandlerThread handlerThread = new HandlerThread("WearableTransport.WriteWatchdogHandler", 9);
        handlerThread.start();
        this.f96997j = new ayav(this, handlerThread.getLooper());
        this.f96995h = axty.f96348a.mo53544a("connection-stuck-write");
        axys.f96797b = new ayap(axys);
    }

    /* renamed from: a */
    public static void m83718a(String str) {
        if (Log.isLoggable("Wear_Transport", 3)) {
            Log.d("Wear_Transport", str);
        }
    }

    /* renamed from: a */
    public final void mo53852a(axyu axyu) {
        this.f96993f.add(axyu);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.OutputStream, java.lang.String], assign insn: 0x06b2: MOVE  (r14v1 ? I:?[OBJECT, ARRAY]) = (r5v14 java.lang.Object) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axua.a(android.content.Context, boolean, android.content.Intent):boolean
     arg types: [android.content.Context, int, android.content.Intent]
     candidates:
      axua.a(byte[], java.lang.Boolean, int):ayev
      axua.a(android.content.Context, android.content.Intent, boolean):void
      axua.a(byqy, byqy, byte[]):byte[]
      axua.a(android.content.Context, boolean, android.content.Intent):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axua.a(android.content.Context, android.content.Intent, boolean):void
     arg types: [android.content.Context, android.content.Intent, int]
     candidates:
      axua.a(byte[], java.lang.Boolean, int):ayev
      axua.a(byqy, byqy, byte[]):byte[]
      axua.a(android.content.Context, boolean, android.content.Intent):boolean
      axua.a(android.content.Context, android.content.Intent, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04ab, code lost:
        if (p000.chnj.f188812a.mo6606a().mo85411aj() == false) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ad, code lost:
        r1 = android.os.Build.VERSION.SDK_INT;
        r1 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04b1, code lost:
        if (r1 == null) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04b4, code lost:
        r1 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04b6, code lost:
        r1 = r1.f97346f;
        r4 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04ba, code lost:
        if (r4 == null) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04bd, code lost:
        r4 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04bf, code lost:
        r1 = p000.ayba.m83722a(r1, r4.f97345e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04c6, code lost:
        if (r1 == -1) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04c8, code lost:
        r3 = new java.lang.StringBuilder(75);
        r3.append("Peer handshake connect succeeded, highest version both support: ");
        r3.append(r1);
        m83718a(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04e1, code lost:
        r1 = android.os.Build.VERSION.SDK_INT;
        r1 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04e5, code lost:
        if (r1 == null) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e8, code lost:
        r1 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04ea, code lost:
        r1 = r1.f97345e;
        r2 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ee, code lost:
        if (r2 == null) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f1, code lost:
        r2 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04f3, code lost:
        r2 = r2.f97346f;
        r4 = new java.lang.StringBuilder(180);
        r4.append("Error: wire protocol version mismatch - our version: ");
        r4.append(1);
        r4.append(", our minimum supported version: ");
        r4.append(0);
        r4.append("; peer version: ");
        r4.append(r1);
        r4.append(", peer minimum supported version: ");
        r4.append(r2);
        android.util.Log.e("Wear_Transport", r4.toString());
        p000.axty.m83201a(4);
        p000.axty.m83204a(4, p000.ayha.m84001g(), r23.mo60245a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0538, code lost:
        throw new p000.aybe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0539, code lost:
        r1 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x053b, code lost:
        if (r1 == null) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x053e, code lost:
        r1 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0540, code lost:
        r1 = r1.f97345e;
        r4 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0544, code lost:
        if (r4 == null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0547, code lost:
        r4 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0549, code lost:
        r4 = r4.f97346f;
        r10 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x054d, code lost:
        if (r1 <= 0) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x054f, code lost:
        r1 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0552, code lost:
        if (r4 <= 1) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0557, code lost:
        if (r1 >= 0) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0559, code lost:
        r1 = android.os.Build.VERSION.SDK_INT;
        r1 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x055d, code lost:
        if (r1 == null) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0560, code lost:
        r1 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0562, code lost:
        r1 = r1.f97345e;
        r2 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0566, code lost:
        if (r2 == null) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0569, code lost:
        r2 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x056b, code lost:
        r2 = r2.f97346f;
        r4 = new java.lang.StringBuilder(180);
        r4.append("Error: wire protocol version mismatch - our version: ");
        r4.append(1);
        r4.append(", our minimum supported version: ");
        r4.append(0);
        r4.append("; peer version: ");
        r4.append(r1);
        r4.append(", peer minimum supported version: ");
        r4.append(r2);
        android.util.Log.e("Wear_Transport", r4.toString());
        p000.axty.m83201a(4);
        p000.axty.m83204a(4, p000.ayha.m84001g(), r23.mo60245a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b0, code lost:
        throw new p000.aybe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05b2, code lost:
        r1 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05b4, code lost:
        if (r1 == null) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05b7, code lost:
        r1 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05b9, code lost:
        r1 = r1.f97345e;
        r4 = new java.lang.StringBuilder(59);
        r4.append("Peer handshake connect succeeded, peer version: ");
        r4.append(r1);
        m83718a(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05d1, code lost:
        r1 = p000.ayfz.m83948a();
        r4 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05d7, code lost:
        if (r4 == null) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05da, code lost:
        r4 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05dc, code lost:
        r10 = r4.f97344d;
        r1 = r1.edit();
        r1.putLong("peer_android_id", r10);
        r1.apply();
        p000.axty.m83201a(2);
        p000.axty.m83204a(2, p000.ayha.m84001g(), r23.mo60245a());
        r1 = r2.f97382e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05fb, code lost:
        if (r1 != null) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05fd, code lost:
        r1 = p000.ayeo.f97339i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05ff, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x025c A[Catch:{ all -> 0x0634, IllegalArgumentException -> 0x007c, all -> 0x0285 }] */
    /* renamed from: a */
    public final void mo53853a(InputStream inputStream, OutputStream outputStream, ConnectionConfiguration connectionConfiguration) {
        ayas ayas;
        int i;
        Throwable th;
        axua axua;
        Object obj;
        ayeo ayeo;
        ayat ayat;
        ayat ayat2;
        int i2;
        boolean z;
        char c;
        byte[] bArr;
        char c2;
        ConnectionConfiguration connectionConfiguration2 = connectionConfiguration;
        ayas ayas2 = new ayas(this.f96997j, connectionConfiguration2);
        ayas2.f96963a = Thread.currentThread();
        try {
            this.f96994g.push(ayas2);
            ayay ayay = new ayay(inputStream, outputStream, aybb.m83726a(), this.f96990c, ayas2);
            byte[] bArr2 = axua.f96354a;
            if (connectionConfiguration.mo60245a()) {
                try {
                    int i3 = Build.VERSION.SDK_INT;
                    axua axua2 = new axua(new axtz(ayay), new ayar(connectionConfiguration2));
                    Context context = this.f96989b;
                    if (axua2.f96358d == null) {
                        Intent intent = new Intent("com.google.android.clockwork.A2AResult");
                        String d = ayha.m83997c().f97221b.mo53984d(axua2.f96360f.f96962a.f110864a);
                        byqy[] byqyArr = new byqy[2];
                        if (!TextUtils.isEmpty(d)) {
                            byte[] b = boan.f132470d.mo68796b(d);
                            byqyArr[0] = byqy.m125145c(Arrays.copyOf(b, 73));
                            int length = b.length;
                            if (length != 73) {
                                try {
                                    byqyArr[1] = byqy.m125145c(Arrays.copyOfRange(b, 73, length));
                                } catch (IllegalArgumentException e) {
                                    Log.w("ConnectionConfig", "couldn't load saved penultimate crypto session");
                                }
                            } else if (Log.isLoggable("ConnectionConfig", 3)) {
                                Log.d("ConnectionConfig", "No saved penultimate crypto session found");
                            }
                        }
                        if (byqyArr[0] != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (axua2.mo53550a(context, z, intent)) {
                            if (axua2.f96358d != null) {
                                try {
                                    ayev a = axua2.f96359e.mo53547a(axua2);
                                    if ((a.f97378a & 16) != 0) {
                                        ayer ayer = a.f97383f;
                                        if (ayer == null) {
                                            ayer = ayer.f97351f;
                                        }
                                        bArr = ayer.f97355c.mo73780k();
                                    } else {
                                        bArr = null;
                                    }
                                    if (bArr != null) {
                                        if (!axua.m83213a(bArr, byqyArr[0], axua2.f96358d, axua.f96356c)) {
                                            Log.d("A2AEncryption", "Failed to validate previous session, trying penultimate");
                                            byqy byqy = byqyArr[1];
                                            if (byqy != null) {
                                                if (axua.m83213a(bArr, byqy, axua2.f96358d, axua.f96356c)) {
                                                    c2 = 1;
                                                }
                                            }
                                            axua2.f96360f.mo53840a(null, null);
                                            axua2.mo53549a("Couldn't validate resume hmac");
                                            c = 2;
                                        } else {
                                            c2 = 0;
                                        }
                                        byte[] a2 = axua.m83215a(byqyArr[c2], axua2.f96358d, axua.f96355b);
                                        axtz axtz = axua2.f96359e;
                                        bxvd da = ayev.f97376n.mo74144da();
                                        bxvd da2 = ayer.f97351f.mo74144da();
                                        bxtx a3 = bxtx.m123261a(a2);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        ayer ayer2 = (ayer) da2.f164949b;
                                        a3.getClass();
                                        ayer2.f97353a |= 2;
                                        ayer2.f97355c = a3;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ayev ayev = (ayev) da.f164949b;
                                        ayer ayer3 = (ayer) da2.mo74062i();
                                        ayer3.getClass();
                                        ayev.f97383f = ayer3;
                                        ayev.f97378a |= 16;
                                        axtz.mo53548a((ayev) da.mo74062i(), axua2);
                                        Log.i("A2AEncryption", "doing handshake");
                                        if (MessageDigest.isEqual(axua.f96354a, axua2.mo53551a())) {
                                            axua2.mo53553b(axua.f96354a);
                                            axua2.f96360f.mo53840a(axua2.f96358d, byqyArr[c2]);
                                            c = 0;
                                        } else {
                                            axua2.mo53549a("confirm handshake failed");
                                            c = 2;
                                        }
                                    } else {
                                        axua2.mo53549a("Unable to read resume bytes");
                                        c = 2;
                                    }
                                } catch (IOException e2) {
                                    String valueOf = String.valueOf(e2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                                    sb.append("IOException during re-encryption ");
                                    sb.append(valueOf);
                                    Log.e("A2AEncryption", sb.toString());
                                    c = 1;
                                }
                            } else {
                                c = 1;
                            }
                            if (c == 0) {
                                if (axua2 != null) {
                                    Log.e("Wear_Transport", "failed mandatory encryption");
                                    m83718a("network processing loop is finished");
                                    axty.m83201a(3);
                                    axty.m83204a(3, ayha.m84001g(), connectionConfiguration.mo60245a());
                                    ayjn.m84115a(ayas2);
                                    return;
                                }
                                axua = axua2;
                            } else if (c == 2) {
                                Log.e("A2AEncryption", "Could not reestablish encryption, restarting fresh");
                                axua2.mo53550a(context, false, intent);
                            } else {
                                Log.e("A2AEncryption", "Failed to resume, though non-fatal error.");
                                Log.e("Wear_Transport", "Could not authenticate as initiator.");
                                axua2 = null;
                                if (axua2 != null) {
                                }
                            }
                        }
                        if (axua2.f96358d != null) {
                            try {
                                Log.i("A2AEncryption", "doing handshake");
                                if (!MessageDigest.isEqual(axua.f96354a, axua2.mo53551a())) {
                                    axua2.mo53553b(new byte[0]);
                                    Log.e("A2AEncryption", "confirm handshake failed");
                                    axua.m83212a(context, intent, false);
                                } else {
                                    axua2.mo53553b(axua.f96354a);
                                    axua2.f96360f.mo53840a(axua2.f96358d, null);
                                    axua.m83212a(context, intent, true);
                                    if (axua2 != null) {
                                    }
                                }
                            } catch (IOException e3) {
                                String valueOf2 = String.valueOf(e3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                                sb2.append("IOException during handshake ");
                                sb2.append(valueOf2);
                                Log.e("A2AEncryption", sb2.toString());
                                axua.m83212a(context, intent, false);
                            }
                        } else {
                            Log.e("A2AEncryption", "authenticateAsInitiator() Session is null.");
                            axua.m83212a(context, intent, false);
                        }
                        Log.e("Wear_Transport", "Could not authenticate as initiator.");
                        axua2 = null;
                        if (axua2 != null) {
                        }
                    } else {
                        throw new IllegalStateException("Encryption already established");
                    }
                } catch (IllegalArgumentException e4) {
                    Log.w("ConnectionConfig", "couldn't load saved previous crypto session");
                } catch (Throwable th2) {
                    th = th2;
                    ayas = ayas2;
                    i = 3;
                }
            } else {
                axua = null;
            }
            String a4 = this.f96996i.mo53674a();
            bxvd da3 = ayev.f97376n.mo74144da();
            bxvd da4 = ayeo.f97339i.mo74144da();
            String str = this.f96998k.mo53808b().f96814a;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ayeo ayeo2 = (ayeo) da4.f164949b;
            str.getClass();
            ayeo2.f97341a |= 1;
            ayeo2.f97342b = str;
            String str2 = this.f96998k.mo53808b().f96815b;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ayeo ayeo3 = (ayeo) da4.f164949b;
            str2.getClass();
            ayeo3.f97341a |= 2;
            ayeo3.f97343c = str2;
            long longValue = ((Long) spn.f44933b.mo25081c()).longValue();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ayeo ayeo4 = (ayeo) da4.f164949b;
            ayeo4.f97341a |= 4;
            ayeo4.f97344d = longValue;
            int i4 = Build.VERSION.SDK_INT;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ayeo ayeo5 = (ayeo) da4.f164949b;
            int i5 = ayeo5.f97341a | 8;
            ayeo5.f97341a = i5;
            ayeo5.f97345e = 1;
            int i6 = i5 | 16;
            ayeo5.f97341a = i6;
            ayeo5.f97346f = 0;
            if (a4 != null) {
                a4.getClass();
                i6 |= 64;
                ayeo5.f97341a = i6;
                ayeo5.f97348h = a4;
            }
            ayeo5.f97341a = i6 | 32;
            ayeo5.f97347g = 3;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ayev ayev2 = (ayev) da3.f164949b;
            ayeo ayeo6 = (ayeo) da4.mo74062i();
            ayeo6.getClass();
            ayev2.f97382e = ayeo6;
            ayev2.f97378a |= 8;
            ayev ayev3 = (ayev) da3.mo74062i();
            aybb.m83731a(ayay, aybb.m83734b(ayev3), aybb.m83725a(ayev3), axua);
            bxvd da5 = ayew.f97392g.mo74144da();
            aybb.m83732a(ayay, da5, axua);
            ayev a5 = aybb.m83727a((ayew) da5.mo74062i());
            if ((a5.f97378a & 8) == 0) {
                String valueOf3 = String.valueOf(ayey.m83900a(a5).f97414m);
                Log.w("Wear_Transport", valueOf3.length() == 0 ? new String("error, peer didn't start with a connect message, found: ") : "error, peer didn't start with a connect message, found: ".concat(valueOf3));
                axty.m83201a(4);
                axty.m83204a(4, ayha.m84001g(), connectionConfiguration.mo60245a());
                ayeo = null;
                obj = null;
            } else {
                if (connectionConfiguration2.f110867d != 2) {
                    obj = null;
                } else if (connectionConfiguration2.f110866c == 1) {
                    obj = null;
                    obj = null;
                    String string = ayfz.m83948a().getString("client_node_id", null);
                    if (string == null) {
                        SharedPreferences a6 = ayfz.m83948a();
                        ayeo ayeo7 = a5.f97382e;
                        if (ayeo7 == null) {
                            ayeo7 = ayeo.f97339i;
                        }
                        String str3 = ayeo7.f97342b;
                        SharedPreferences.Editor edit = a6.edit();
                        edit.putString("client_node_id", str3);
                        edit.apply();
                    } else {
                        ayeo ayeo8 = a5.f97382e;
                        if (ayeo8 == null) {
                            ayeo8 = ayeo.f97339i;
                        }
                        if (!string.equals(ayeo8.f97342b)) {
                            this.f96996i.mo53684e();
                            throw new axwa();
                        }
                    }
                } else {
                    obj = null;
                }
                ayeo ayeo9 = a5.f97382e;
                if (ayeo9 == null) {
                    ayeo9 = ayeo.f97339i;
                }
                String str4 = ayeo9.f97348h;
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(a4)) {
                    if (!a4.equals(str4)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a4).length() + 83 + String.valueOf(str4).length());
                        sb3.append("Error: networkid mismatch - the expected networkId is ");
                        sb3.append(a4);
                        sb3.append(" but the actual networkId is ");
                        sb3.append(str4);
                        Log.w("Wear_Transport", sb3.toString());
                        this.f96996i.mo53684e();
                        throw new axwa();
                    }
                }
                ayeo ayeo10 = a5.f97382e;
                if (ayeo10 == null) {
                    ayeo10 = ayeo.f97339i;
                }
                String str5 = ayeo10.f97342b;
                axwi axwi = this.f96996i;
                synchronized (axwi.f96600y) {
                    if (!axwi.f96579d.getStringSet("nodesToRevoke", Collections.emptySet()).contains(str5)) {
                        String valueOf4 = String.valueOf(str5);
                        if (axwi.f96579d.getInt(valueOf4.length() == 0 ? new String("node_is_enrolled:") : "node_is_enrolled:".concat(valueOf4), 1) != 3) {
                        }
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 29);
                    sb4.append("Error: node ");
                    sb4.append(str5);
                    sb4.append(" has been revoked");
                    Log.w("Wear_Transport", sb4.toString());
                    this.f96996i.mo53684e();
                    throw new axwa();
                }
            }
        } catch (IOException e5) {
            obj = null;
            m83718a("error while connecting to peer");
            axty.m83201a(4);
            axty.m83204a(4, ayha.m84001g(), connectionConfiguration.mo60245a());
            ayeo = null;
        } catch (Throwable th3) {
            th = th3;
            ayas = ayas2;
            i = 3;
            th = th;
            m83718a("network processing loop is finished");
            axty.m83201a(i);
            axty.m83204a(i, ayha.m84001g(), connectionConfiguration.mo60245a());
            ayjn.m84115a(ayas);
            throw th;
        }
        if (ayeo == null) {
            m83718a("network processing loop is finished");
            axty.m83201a(3);
            axty.m83204a(3, ayha.m84001g(), connectionConfiguration.mo60245a());
            ayjn.m84115a(ayas2);
            return;
        }
        String valueOf5 = String.valueOf(ayeo.f97342b);
        m83718a(valueOf5.length() == 0 ? new String("connected to node ") : "connected to node ".concat(valueOf5));
        connectionConfiguration2.mo60244a(ayeo.f97342b);
        Context context2 = this.f96989b;
        axys axys = this.f96990c;
        boolean a7 = connectionConfiguration.mo60245a();
        int i7 = Build.VERSION.SDK_INT;
        ayan ayan = new ayan(context2, axys, outputStream, ayeo, ayas2, a7, axua, ayba.m83722a(ayeo.f97346f, ayeo.f97345e));
        i = 3;
        ayan ayan2 = ayan;
        ? r14 = obj;
        ayas = ayas2;
        try {
            ayau ayau = new ayau(this, inputStream, ayeo, ayas2, ayan2, axua);
            Semaphore semaphore = new Semaphore(0);
            ayat = new ayat(ayan2, semaphore);
            ayat2 = new ayat(ayau, semaphore);
            this.f96992e.add(connectionConfiguration2);
            this.f96991d.add(ayan2);
            ayat.start();
            Iterator it = this.f96993f.iterator();
            while (it.hasNext()) {
                ((axyu) it.next()).mo53588a(ayan2);
            }
            ayat2.start();
            m83718a("blocking until network processing loop finishes...");
            semaphore.acquire();
        } catch (InterruptedException e6) {
            Log.i("Wear_Transport", "Interrupt signal received; shutting down reader/writer threads.");
        } catch (Throwable th4) {
            th = th4;
        }
        ayat.interrupt();
        ayat2.interrupt();
        ayjn.m84115a(inputStream);
        ayjn.m84115a(outputStream);
        ayan2.f96941a = r14;
        synchronized (ayan2.f96945e) {
            SparseArray sparseArray = ayan2.f96945e;
            int size = sparseArray.size();
            i2 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                Queue queue = (Queue) sparseArray.valueAt(i8);
                for (axzu axzu = (axzu) queue.poll(); axzu != null; axzu = (axzu) queue.poll()) {
                    i2++;
                    axzu.mo53813d();
                }
            }
        }
        StringBuilder sb5 = new StringBuilder(39);
        sb5.append("purged ");
        sb5.append(i2);
        sb5.append(" messages from writer");
        ayan2.mo53836a(sb5.toString());
        String str6 = ayan2.f96942b.f96814a;
        Iterator it2 = this.f96993f.iterator();
        while (it2.hasNext()) {
            ((axyu) it2.next()).mo53589a(str6);
        }
        this.f96991d.remove(ayan2);
        this.f96992e.remove(connectionConfiguration2);
        connectionConfiguration2.mo60244a(r14);
        bqhi.m112840a(ayat);
        bqhi.m112840a(ayat2);
        m83718a("network processing loop is finished");
        axty.m83201a(3);
        axty.m83204a(3, ayha.m84001g(), connectionConfiguration.mo60245a());
        ayjn.m84115a(ayas);
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        this.f96990c.mo53558a(ssb, z, z2);
        ssb.println();
        ssb.mo26034a();
        for (ayan ayan : this.f96991d) {
            ayan.mo53558a(ssb, z, z2);
        }
        ssb.println();
        ssb.println("connection stats");
        ssb.mo26034a();
        for (ayas ayas : this.f96994g) {
            ayas.mo53843a(ssb);
        }
        ssb.mo26035b();
        ssb.mo26035b();
    }
}
