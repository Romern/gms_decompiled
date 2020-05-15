package p000;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.FileApkChimeraService;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: qly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qly {

    /* renamed from: c */
    private static qly f41681c;

    /* renamed from: a */
    public final Object f41682a = new Object();

    /* renamed from: b */
    public final bnkd f41683b = bndu.m109108a(3, 3);

    /* renamed from: d */
    private final Context f41684d;

    /* renamed from: e */
    private Service f41685e;

    /* renamed from: f */
    private final bqgj f41686f = snp.m35704b(9);

    /* renamed from: g */
    private final bnkd f41687g = bndu.m109108a(3, 3);

    /* renamed from: h */
    private dks f41688h = null;

    /* renamed from: i */
    private ExecutorService f41689i = null;

    /* renamed from: j */
    private final ArrayDeque f41690j = new ArrayDeque();

    /* renamed from: k */
    private int f41691k = -1;

    public qly(Context context) {
        this.f41684d = context.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124 A[SYNTHETIC] */
    /* renamed from: a */
    public static int m32408a(Context context, Intent intent, int i) {
        boolean z;
        int i2;
        Callable callable;
        dks dks;
        boolean z2;
        synchronized (qly.class) {
            if (f41681c == null) {
                f41681c = new qly(context);
            }
            if (context instanceof FileApkChimeraService) {
                qly qly = f41681c;
                FileApkChimeraService fileApkChimeraService = (FileApkChimeraService) context;
                synchronized (qly.f41682a) {
                    Service service = qly.f41685e;
                    if (service == null) {
                        z2 = true;
                    } else {
                        z2 = service == fileApkChimeraService;
                    }
                    String valueOf = String.valueOf(service);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                    sb.append("Expected existing service to be null or the same. Was: ");
                    sb.append(valueOf);
                    bmzs.m108700a(z2, sb.toString(), new Object[0]);
                    qly.f41685e = fileApkChimeraService;
                }
            }
            qly qly2 = f41681c;
            boolean equals = "com.google.android.gms.chimera.container.STAGE_MODULE_APKS".equals(intent.getAction());
            String valueOf2 = String.valueOf(intent.getAction());
            bmzs.m108700a(equals, valueOf2.length() == 0 ? new String("Expected STAGE_MODULES_ACTION but was: ") : "Expected STAGE_MODULES_ACTION but was: ".concat(valueOf2), new Object[0]);
            String stringExtra = intent.getStringExtra("STAGE_FILE_APKS_MODULE_ID");
            String stringExtra2 = intent.getStringExtra("STAGE_FILE_APKS_ASSET_NAME");
            ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
            if (stringExtra == null) {
                z = true;
            } else {
                z = stringExtra2 == null;
            }
            bmzs.m108698a(z);
            boolean z3 = !FileApkIntentOperation.m22400a(intent);
            synchronized (qly2.f41682a) {
                i2 = 3;
                callable = null;
                if (!(stringExtra == null || resultReceiver == null)) {
                    try {
                        if (dfy.m8329a(qly2.f41684d).mo8898f().mo9172a(stringExtra) == null) {
                            qly2.f41687g.mo67268a(stringExtra, resultReceiver);
                        } else {
                            StringBuilder sb2 = new StringBuilder(stringExtra.length() + 46);
                            sb2.append("Staging ");
                            sb2.append(stringExtra);
                            sb2.append(" already complete, notifying receiver.");
                            sb2.toString();
                            resultReceiver.send(0, null);
                            i2 = 2;
                            if (!(stringExtra2 == null || resultReceiver == null)) {
                                dks = qly2.f41688h;
                                bmzs.m108696a(dks);
                                qly2.f41683b.mo67268a(stringExtra2, resultReceiver);
                                synchronized (dks.f13425c) {
                                    int indexOf = dks.f13427e.indexOf(stringExtra2);
                                    if (indexOf == -1) {
                                        if (!dks.f13426d.contains(stringExtra2)) {
                                            dks.f13426d.offer(stringExtra2);
                                        }
                                    } else if (indexOf < dks.f13428f) {
                                        dks.f13424b.execute(new dkp(dks, stringExtra2));
                                    }
                                }
                            }
                            if (i != -1) {
                                qly2.f41691k = i;
                            }
                        }
                    } catch (InvalidConfigException e) {
                    }
                }
                if (qly2.f41688h == null) {
                    qly2.f41689i = snp.m35704b(9);
                    dks a = dks.m8749a(new qlt(qly2), qly2.f41689i);
                    qly2.f41688h = a;
                    callable = m32410a(qly2.f41684d, a, qly2.f41689i, intent, 1);
                } else if (z3) {
                    qly2.f41690j.add(Pair.create(intent, Integer.valueOf(i)));
                }
                dks = qly2.f41688h;
                bmzs.m108696a(dks);
                qly2.f41683b.mo67268a(stringExtra2, resultReceiver);
                synchronized (dks.f13425c) {
                }
            }
            if (callable == null) {
                qly2.m32412b();
            } else {
                qly2.m32411a(callable);
            }
        }
        return i2;
    }

    /* renamed from: b */
    private final void m32412b() {
        boolean z;
        synchronized (qly.class) {
            synchronized (this.f41682a) {
                z = true;
                if (this.f41688h == null) {
                    Service service = this.f41685e;
                    if (service != null) {
                        service.stopSelf(this.f41691k);
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                f41681c = null;
            }
        }
    }

    /* renamed from: a */
    private static Callable m32410a(Context context, dks dks, ExecutorService executorService, Intent intent, int i) {
        return new qlu(intent, context, dks, executorService, i);
    }

    /* renamed from: a */
    private final void m32411a(Callable callable) {
        bqga.m112781a(this.f41686f.mo25819b(callable), new qlw(this), this.f41686f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r3 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        m32412b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        m32411a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo24102a(qlx qlx) {
        boolean z;
        synchronized (this.f41682a) {
            dks dks = this.f41688h;
            ExecutorService executorService = this.f41689i;
            bmzs.m108696a(dks);
            bmzs.m108696a(executorService);
            synchronized (dks.f13425c) {
                z = !dks.f13426d.isEmpty();
            }
            if (z && qlx != null) {
                int i = qlx.f41680b;
                if (i < 2) {
                    m32411a(m32410a(this.f41684d, dks, executorService, qlx.f41679a, i + 1));
                    return;
                }
            }
            mo24103a(true);
            Pair pair = (Pair) this.f41690j.poll();
            Callable callable = null;
            if (pair != null) {
                callable = m32410a(this.f41684d, dks, executorService, (Intent) pair.first, 1);
                Service service = this.f41685e;
                if (service != null) {
                    service.stopSelf(((Integer) pair.second).intValue() - 1);
                }
            } else {
                executorService.shutdown();
                this.f41688h = null;
                this.f41689i = null;
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:313)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:123)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: a */
    public final void mo24103a(boolean r13) {
        /*
            r12 = this;
            java.lang.String r0 = " asset receivers of failure."
            java.lang.String r1 = " module ID and "
            java.lang.String r2 = "Staging complete, notified "
            r3 = 92
            r4 = -1
            r5 = 0
            android.content.Context r6 = r12.f41684d     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            dfy r6 = p000.dfy.m8329a(r6)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            djz r6 = r6.mo8898f()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            bnkd r8 = r12.f41687g     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            bndd r8 = (p000.bndd) r8     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            int r8 = r8.f131478b     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r7.<init>(r8)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            bnkd r8 = r12.f41687g     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.Set r8 = r8.mo67316o()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
        L_0x0029:
            boolean r9 = r8.hasNext()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r9 == 0) goto L_0x003f
            java.lang.Object r9 = r8.next()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            dka r10 = r6.mo9172a(r9)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r10 == 0) goto L_0x0029
            r7.add(r9)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            goto L_0x0029
        L_0x003f:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
        L_0x0043:
            boolean r7 = r6.hasNext()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r7 == 0) goto L_0x009b
            java.lang.Object r7 = r6.next()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            bnkd r8 = r12.f41687g     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.List r8 = r8.mo67126b(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            boolean r9 = r8.isEmpty()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r9 != 0) goto L_0x0043
            int r9 = r8.size()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            int r10 = r10.length()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            int r10 = r10 + 54
            r11.<init>(r10)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r10 = "Staging "
            r11.append(r10)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r11.append(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r7 = " completed, notifying "
            r11.append(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r11.append(r9)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r7 = " receiver(s)."
            r11.append(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r11.toString()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
        L_0x008a:
            boolean r8 = r7.hasNext()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r8 == 0) goto L_0x0043
            java.lang.Object r8 = r7.next()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            android.os.ResultReceiver r8 = (android.os.ResultReceiver) r8     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r9 = 0
            r8.send(r9, r5)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            goto L_0x008a
        L_0x009b:
            if (r13 == 0) goto L_0x01de
            bnkd r13 = r12.f41683b
            boolean r13 = r13.mo67314m()
            if (r13 == 0) goto L_0x00ad
            bnkd r13 = r12.f41687g
            boolean r13 = r13.mo67314m()
            if (r13 != 0) goto L_0x01de
        L_0x00ad:
            bnkd r13 = r12.f41687g
            java.util.Collection r13 = r13.mo67317p()
            java.util.Iterator r13 = r13.iterator()
        L_0x00b7:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00c7
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x00b7
        L_0x00c7:
            bnkd r13 = r12.f41683b
            java.util.Collection r13 = r13.mo67317p()
            java.util.Iterator r13 = r13.iterator()
        L_0x00d1:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x00d1
        L_0x00e1:
            bnkd r13 = r12.f41687g
            bndd r13 = (p000.bndd) r13
            int r13 = r13.f131478b
            bnkd r4 = r12.f41683b
            bndd r4 = (p000.bndd) r4
            int r4 = r4.f131478b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
        L_0x00f2:
            r5.append(r2)
            r5.append(r13)
            r5.append(r1)
            r5.append(r4)
            r5.append(r0)
            r5.toString()
            bnkd r13 = r12.f41687g
            r13.mo67270d()
            bnkd r13 = r12.f41683b
            r13.mo67270d()
            return
        L_0x010f:
            r6 = move-exception
            if (r13 == 0) goto L_0x0183
            bnkd r13 = r12.f41683b
            boolean r13 = r13.mo67314m()
            if (r13 == 0) goto L_0x0122
            bnkd r13 = r12.f41687g
            boolean r13 = r13.mo67314m()
            if (r13 != 0) goto L_0x0183
        L_0x0122:
            bnkd r13 = r12.f41687g
            java.util.Collection r13 = r13.mo67317p()
            java.util.Iterator r13 = r13.iterator()
        L_0x012c:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x013c
            java.lang.Object r7 = r13.next()
            android.os.ResultReceiver r7 = (android.os.ResultReceiver) r7
            r7.send(r4, r5)
            goto L_0x012c
        L_0x013c:
            bnkd r13 = r12.f41683b
            java.util.Collection r13 = r13.mo67317p()
            java.util.Iterator r13 = r13.iterator()
        L_0x0146:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0156
            java.lang.Object r7 = r13.next()
            android.os.ResultReceiver r7 = (android.os.ResultReceiver) r7
            r7.send(r4, r5)
            goto L_0x0146
        L_0x0156:
            bnkd r13 = r12.f41687g
            bndd r13 = (p000.bndd) r13
            int r13 = r13.f131478b
            bnkd r4 = r12.f41683b
            bndd r4 = (p000.bndd) r4
            int r4 = r4.f131478b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r2)
            r5.append(r13)
            r5.append(r1)
            r5.append(r4)
            r5.append(r0)
            r5.toString()
            bnkd r13 = r12.f41687g
            r13.mo67270d()
            bnkd r13 = r12.f41683b
            r13.mo67270d()
        L_0x0183:
            throw r6
        L_0x0184:
            r6 = move-exception
            if (r13 == 0) goto L_0x01de
            bnkd r13 = r12.f41683b
            boolean r13 = r13.mo67314m()
            if (r13 == 0) goto L_0x0197
            bnkd r13 = r12.f41687g
            boolean r13 = r13.mo67314m()
            if (r13 != 0) goto L_0x01de
        L_0x0197:
            bnkd r13 = r12.f41687g
            java.util.Collection r13 = r13.mo67317p()
            java.util.Iterator r13 = r13.iterator()
        L_0x01a1:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x01b1
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x01a1
        L_0x01b1:
            bnkd r13 = r12.f41683b
            java.util.Collection r13 = r13.mo67317p()
            java.util.Iterator r13 = r13.iterator()
        L_0x01bb:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x01cb
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x01bb
        L_0x01cb:
            bnkd r13 = r12.f41687g
            bndd r13 = (p000.bndd) r13
            int r13 = r13.f131478b
            bnkd r4 = r12.f41683b
            bndd r4 = (p000.bndd) r4
            int r4 = r4.f131478b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            goto L_0x00f2
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qly.mo24103a(boolean):void");
    }
}
