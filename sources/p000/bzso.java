package p000;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bzso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzso implements bzsq {

    /* renamed from: a */
    public String f171270a;

    /* renamed from: b */
    public bzsu f171271b;

    /* renamed from: c */
    private final String f171272c;

    /* renamed from: d */
    private final String f171273d;

    /* renamed from: e */
    private final bzsa f171274e;

    /* renamed from: f */
    private final String f171275f;

    /* renamed from: g */
    private final bzrx f171276g;

    /* renamed from: h */
    private final long f171277h;

    /* renamed from: i */
    private double f171278i;

    /* renamed from: j */
    private int f171279j = 1;

    /* renamed from: k */
    private long f171280k;

    /* renamed from: l */
    private final Random f171281l;

    /* renamed from: m */
    private int f171282m;

    public bzso(String str, String str2, bzsa bzsa, bzrx bzrx, String str3, bzsw bzsw) {
        long j;
        this.f171272c = str;
        this.f171273d = str2;
        this.f171274e = bzsa;
        this.f171275f = str3;
        this.f171276g = bzrx;
        if (bzsw != null) {
            j = bzsw.f171300a;
        } else {
            j = 60;
        }
        this.f171277h = j;
        this.f171278i = 0.0d;
        this.f171280k = 1;
        this.f171281l = new Random();
    }

    /* renamed from: a */
    private final bzsb m126146a(bzsa bzsa, String str, bzrx bzrx) {
        String str2;
        String str3;
        bqgg a;
        bzsa bzsa2 = new bzsa();
        bzsa2.mo74559a("X-Goog-Upload-Protocol", "resumable");
        bzsa2.mo74559a("X-Goog-Upload-Command", str);
        for (String str4 : bzsa.mo74558a()) {
            for (String str5 : bzsa.mo74561b(str4)) {
                bzsa2.mo74559a(str4, str5);
            }
        }
        if (!str.equals("start")) {
            str2 = this.f171270a;
        } else {
            str2 = this.f171272c;
        }
        if (!str.contains("start")) {
            str3 = "PUT";
        } else {
            str3 = this.f171273d;
        }
        bzsq a2 = bzse.m126112a(str2, str3, bzsa2, bzrx);
        if (this.f171271b != null && !str.equals("start")) {
            synchronized (this) {
                a2.mo74568a(new bzsm(this, this.f171271b), this.f171282m);
            }
        }
        synchronized (this) {
            a = a2.mo74567a();
        }
        try {
            bzst bzst = (bzst) a.get();
            if (!bzst.mo74577a()) {
                return bzst.f171296b;
            }
            if (bzst.f171295a.f171294a != bzsr.CANCELED) {
                throw bzst.f171295a;
            }
            throw new bzss(bzsr.CONNECTION_ERROR, "");
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() == 0 ? new String("Unexpected error occurred: ") : "Unexpected error occurred: ".concat(valueOf));
        } catch (ExecutionException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unexpected error occurred: ") : "Unexpected error occurred: ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    private static final boolean m126148a(bzsb bzsb) {
        return bzsb.f171220a / 100 == 4;
    }

    /* renamed from: b */
    private static final boolean m126149b(bzsb bzsb) {
        bzsa bzsa = bzsb.f171221b;
        if (bzsa != null) {
            return "final".equalsIgnoreCase(bzsa.mo74563c("X-Goog-Upload-Status"));
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m126150c() {
        try {
            return this.f171276g.mo20327h();
        } catch (IOException e) {
            throw new bzss(bzsr.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    /* renamed from: e */
    private final void m126152e() {
        if (this.f171276g.mo20323d() > this.f171276g.mo20321c()) {
            this.f171276g.mo20320b();
            m126153f();
        }
    }

    /* renamed from: f */
    private final void m126153f() {
        this.f171280k = 1;
        this.f171278i = 0.0d;
    }

    /* renamed from: d */
    public final long mo74571d() {
        return this.f171276g.mo20323d();
    }

    /* renamed from: b */
    public final bzsb mo74575b() {
        synchronized (this) {
            bzsu bzsu = this.f171271b;
            if (bzsu != null) {
                bzsu.mo19706a();
            }
        }
        m126153f();
        while (true) {
            try {
                bzsa bzsa = this.f171274e;
                String str = this.f171275f;
                if (str == null) {
                    str = "";
                }
                bzsb a = m126146a(bzsa, "start", new bzsp(str));
                if (m126149b(a)) {
                    return a;
                }
                if (m126151c(a)) {
                    bzsa bzsa2 = a.f171221b;
                    String c = bzsa2.mo74563c("X-Goog-Upload-URL");
                    try {
                        new URL(c);
                        this.f171270a = c;
                        synchronized (this) {
                        }
                        String c2 = bzsa2.mo74563c("X-Goog-Upload-Chunk-Granularity");
                        if (c2 != null) {
                            try {
                                this.f171279j = Integer.parseInt(c2);
                            } catch (NumberFormatException e) {
                                throw new bzss(bzsr.SERVER_ERROR, "Server returned an invalid chunk granularity.", e);
                            }
                        }
                        return mo74574a(false);
                    } catch (MalformedURLException e2) {
                        throw new bzss(bzsr.SERVER_ERROR, "Server returned an invalid upload url.", e2);
                    }
                } else if (m126148a(a)) {
                    return a;
                } else {
                    m126147a(new bzss(bzsr.SERVER_ERROR, a.mo74565a()));
                }
            } catch (bzss e3) {
                if (e3.mo74576a()) {
                    m126147a(e3);
                } else {
                    throw e3;
                }
            }
        }
    }

    /* renamed from: c */
    private static final boolean m126151c(bzsb bzsb) {
        bzsa bzsa = bzsb.f171221b;
        return bzsa != null && "active".equalsIgnoreCase(bzsa.mo74563c("X-Goog-Upload-Status")) && bzsb.f171220a == 200;
    }

    /* renamed from: a */
    private final void m126147a(bzss bzss) {
        if (this.f171278i < ((double) this.f171277h)) {
            double nextDouble = this.f171281l.nextDouble();
            try {
                double d = this.f171278i;
                long j = this.f171280k;
                double d2 = (double) j;
                Double.isNaN(d2);
                this.f171278i = d + (d2 * nextDouble);
                double d3 = (double) (j * 1000);
                Double.isNaN(d3);
                Thread.sleep((long) (d3 * nextDouble));
            } catch (InterruptedException e) {
            }
            long j2 = this.f171280k;
            this.f171280k = j2 + j2;
            return;
        }
        throw bzss;
    }

    /* renamed from: a */
    public final bqgg mo74567a() {
        bqgh a = bqgh.m112796a(new bzsl(this));
        bqha bqha = new bqha();
        bqha.mo69262a("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(bqha.m112820a(bqha));
        newSingleThreadExecutor.submit(a);
        newSingleThreadExecutor.shutdown();
        return a;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [bzrx, java.lang.Object], assign insn: 0x0089: IGET  (r1v14 ? I:java.lang.Object) = (r0v14 bzsn) bzsn.a java.lang.Object */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:58)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020b A[EDGE_INSN: B:107:0x020b->B:91:0x020b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00fd A[SYNTHETIC] */
    /* renamed from: a */
    public final p000.bzsb mo74574a(boolean r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0005
            r9 = r8
            goto L_0x0108
        L_0x0005:
            r9 = r8
        L_0x0006:
            boolean r0 = r9.m126150c()
            r1 = 1
            if (r0 != 0) goto L_0x0019
            bzsn r0 = new bzsn
            bzrx r2 = r9.f171276g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r2, r1)
            goto L_0x0089
        L_0x0019:
            bzrx r0 = r9.f171276g
            long r2 = r0.mo20324e()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            bzsk r0 = new bzsk     // Catch:{ IOException -> 0x0073 }
            bzrx r2 = r9.f171276g     // Catch:{ IOException -> 0x0073 }
            int r3 = r9.f171279j     // Catch:{ IOException -> 0x0073 }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0073 }
            long r2 = r0.mo20326g()
            bzrx r4 = r9.f171276g
            long r4 = r4.mo20324e()
            int r6 = r9.f171279j
            long r6 = (long) r6
            long r4 = r4 / r6
            long r4 = r4 * r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0067
            bzrx r2 = r9.f171276g
            long r2 = r2.mo20323d()
            long r4 = r0.mo20326g()
            long r2 = r2 + r4
            bzrx r4 = r9.f171276g
            long r4 = r4.mo20326g()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            bzsn r1 = new bzsn
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.<init>(r0, r2)
            r0 = r1
            goto L_0x0089
        L_0x0067:
            bzsn r0 = new bzsn
            bzrx r2 = r9.f171276g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r2, r1)
            goto L_0x0089
        L_0x0073:
            r9 = move-exception
            bzss r0 = new bzss
            bzsr r1 = p000.bzsr.REQUEST_BODY_READ_ERROR
            java.lang.String r2 = "Could not create chunked data stream."
            r0.<init>(r1, r2, r9)
            throw r0
        L_0x007e:
            bzsn r0 = new bzsn
            bzrx r2 = r9.f171276g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r2, r1)
        L_0x0089:
            java.lang.Object r1 = r0.f171268a
            java.lang.Object r0 = r0.f171269b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r2 = r9.m126150c()
            if (r2 != 0) goto L_0x009c
            java.lang.String r2 = "finalize"
            goto L_0x00a3
        L_0x009c:
            if (r0 != 0) goto L_0x00a1
            java.lang.String r2 = "upload"
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r2 = "upload, finalize"
        L_0x00a3:
            bzsu r3 = r9.f171271b
            if (r3 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r3.mo19707a(r9)
        L_0x00ab:
            bzsa r3 = new bzsa
            r3.<init>()
            bzrx r4 = r9.f171276g
            long r4 = r4.mo20323d()
            java.lang.String r4 = java.lang.Long.toString(r4)
            java.lang.String r5 = "X-Goog-Upload-Offset"
            r3.mo74559a(r5, r4)
            bzsb r1 = r9.m126146a(r3, r2, r1)     // Catch:{ bzss -> 0x00fe }
            boolean r2 = m126149b(r1)
            if (r2 != 0) goto L_0x00fd
            boolean r2 = m126151c(r1)
            if (r2 != 0) goto L_0x00ec
            boolean r0 = m126148a(r1)
            if (r0 != 0) goto L_0x00d6
            goto L_0x00dd
        L_0x00d6:
            int r0 = r1.f171220a
            r2 = 400(0x190, float:5.6E-43)
            if (r0 == r2) goto L_0x00dd
            return r1
        L_0x00dd:
            bzss r0 = new bzss
            bzsr r2 = p000.bzsr.SERVER_ERROR
            java.lang.String r1 = r1.mo74565a()
            r0.<init>(r2, r1)
            r9.m126147a(r0)
            goto L_0x0108
        L_0x00ec:
            if (r0 != 0) goto L_0x00f3
            r9.m126152e()
            goto L_0x0006
        L_0x00f3:
            bzss r9 = new bzss
            bzsr r0 = p000.bzsr.SERVER_ERROR
            java.lang.String r1 = "Finalize call returned active state."
            r9.<init>(r0, r1)
            throw r9
        L_0x00fd:
            return r1
        L_0x00fe:
            r0 = move-exception
            boolean r1 = r0.mo74576a()
            if (r1 == 0) goto L_0x021d
            r9.m126147a(r0)
        L_0x0108:
            bzsa r0 = new bzsa     // Catch:{ bzss -> 0x0210 }
            r0.<init>()     // Catch:{ bzss -> 0x0210 }
            java.lang.String r1 = "query"
            bzsp r2 = new bzsp     // Catch:{ bzss -> 0x0210 }
            java.lang.String r3 = ""
            r2.<init>(r3)     // Catch:{ bzss -> 0x0210 }
            bzsb r0 = r9.m126146a(r0, r1, r2)     // Catch:{ bzss -> 0x0210 }
            boolean r1 = m126149b(r0)
            if (r1 != 0) goto L_0x020b
            boolean r1 = m126151c(r0)
            if (r1 != 0) goto L_0x013b
            boolean r1 = m126148a(r0)
            if (r1 != 0) goto L_0x020b
            bzss r1 = new bzss
            bzsr r2 = p000.bzsr.SERVER_ERROR
            java.lang.String r0 = r0.mo74565a()
            r1.<init>(r2, r0)
            r9.m126147a(r1)
            goto L_0x0108
        L_0x013b:
            bzsa r1 = r0.f171221b
            java.lang.String r2 = "X-Goog-Upload-Chunk-Granularity"
            java.lang.String r1 = r1.mo74563c(r2)
            if (r1 == 0) goto L_0x0157
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x014c }
            r9.f171279j = r1     // Catch:{ NumberFormatException -> 0x014c }
            goto L_0x0157
        L_0x014c:
            r9 = move-exception
            bzss r0 = new bzss
            bzsr r1 = p000.bzsr.SERVER_ERROR
            java.lang.String r2 = "Server returned an invalid chunk granularity."
            r0.<init>(r1, r2, r9)
            throw r0
        L_0x0157:
            bzsa r0 = r0.f171221b     // Catch:{ NumberFormatException -> 0x0200 }
            java.lang.String r1 = "X-Goog-Upload-Size-Received"
            java.lang.String r0 = r0.mo74563c(r1)     // Catch:{ NumberFormatException -> 0x0200 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0200 }
            bzrx r2 = r9.f171276g
            long r2 = r2.mo20321c()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x01d7
            bzrx r2 = r9.f171276g
            long r2 = r2.mo20323d()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            bzrx r2 = r9.f171276g
            r2.mo20325f()
        L_0x017d:
            bzrx r2 = r9.f171276g
            long r2 = r2.mo20323d()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x01d2
            boolean r2 = r9.m126150c()
            if (r2 == 0) goto L_0x01a9
            bzrx r2 = r9.f171276g     // Catch:{ IOException -> 0x019e }
            long r3 = r2.mo20323d()     // Catch:{ IOException -> 0x019e }
            long r3 = r0 - r3
            r2.mo20317a(r3)     // Catch:{ IOException -> 0x019e }
            bzrx r2 = r9.f171276g     // Catch:{ IOException -> 0x019e }
            r2.mo20320b()     // Catch:{ IOException -> 0x019e }
            goto L_0x017d
        L_0x019e:
            r9 = move-exception
            bzss r0 = new bzss
            bzsr r1 = p000.bzsr.REQUEST_BODY_READ_ERROR
            java.lang.String r2 = "Could not skip in the data stream."
            r0.<init>(r1, r2, r9)
            throw r0
        L_0x01a9:
            bzss r2 = new bzss
            bzsr r3 = p000.bzsr.REQUEST_BODY_READ_ERROR
            bzrx r9 = r9.f171276g
            long r4 = r9.mo20323d()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r6 = 241(0xf1, float:3.38E-43)
            r9.<init>(r6)
            java.lang.String r6 = "Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: "
            r9.append(r6)
            r9.append(r0)
            java.lang.String r0 = " Size: "
            r9.append(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r2.<init>(r3, r9)
            throw r2
        L_0x01d2:
            r9.m126152e()
            r0 = 0
            goto L_0x020b
        L_0x01d7:
            bzss r2 = new bzss
            bzsr r3 = p000.bzsr.SERVER_ERROR
            bzrx r9 = r9.f171276g
            long r4 = r9.mo20321c()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r6 = 123(0x7b, float:1.72E-43)
            r9.<init>(r6)
            java.lang.String r6 = "The server lost bytes that were previously committed. Our offset: "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = ", server offset: "
            r9.append(r4)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r2.<init>(r3, r9)
            throw r2
        L_0x0200:
            r9 = move-exception
            bzss r0 = new bzss
            bzsr r1 = p000.bzsr.SERVER_ERROR
            java.lang.String r2 = "Failed to parse X-Goog-Upload-Size-Received header"
            r0.<init>(r1, r2, r9)
            throw r0
        L_0x020b:
            if (r0 != 0) goto L_0x020f
            goto L_0x0006
        L_0x020f:
            return r0
        L_0x0210:
            r0 = move-exception
            boolean r1 = r0.mo74576a()
            if (r1 == 0) goto L_0x021c
            r9.m126147a(r0)
            goto L_0x0108
        L_0x021c:
            throw r0
        L_0x021d:
            goto L_0x021f
        L_0x021e:
            throw r0
        L_0x021f:
            goto L_0x021e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bzso.mo74574a(boolean):bzsb");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final synchronized void mo74568a(bzsu bzsu, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Progress threshold (bytes) must be greater than 0");
        bmxy.m108589a(true, (Object) "Progress threshold (millis) must be greater or equal to 0");
        this.f171271b = bzsu;
        this.f171282m = i;
    }
}
