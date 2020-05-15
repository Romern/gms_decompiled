package p000;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acev implements bamd {

    /* renamed from: f */
    public static final /* synthetic */ int f59683f = 0;

    /* renamed from: g */
    private static final String[] f59684g = {"apps"};

    /* renamed from: h */
    private static final QuerySpecification f59685h;

    /* renamed from: a */
    public final cayo f59686a;

    /* renamed from: b */
    public final cayo f59687b;

    /* renamed from: c */
    public final Executor f59688c;

    /* renamed from: d */
    public final aceo f59689d;

    /* renamed from: e */
    public final Map f59690e = new HashMap();

    /* renamed from: i */
    private final PackageManager f59691i;

    /* renamed from: j */
    private final bmzi f59692j;

    /* renamed from: k */
    private final ayuj f59693k;

    /* renamed from: l */
    private final ayuj f59694l;

    /* renamed from: m */
    private final ayuj f59695m;

    /* renamed from: n */
    private final apsn f59696n;

    /* renamed from: o */
    private final accz f59697o;

    static {
        frv frv = new frv();
        frv.mo11221b();
        frv.mo11220a(new Section("name"));
        frv.mo11220a(new Section("package_name"));
        f59685h = frv.mo11219a();
    }

    public acev(cayo cayo, accz accz, PackageManager packageManager, cayo cayo2, Executor executor, apsn apsn, aceo aceo, bmzi bmzi, ayuj ayuj, ayuj ayuj2, ayuj ayuj3) {
        this.f59686a = cayo;
        this.f59697o = accz;
        this.f59691i = packageManager;
        this.f59687b = cayo2;
        this.f59688c = executor;
        this.f59696n = apsn;
        this.f59689d = aceo;
        this.f59692j = bmzi;
        this.f59693k = ayuj;
        this.f59694l = ayuj2;
        this.f59695m = ayuj3;
    }

    /* renamed from: a */
    private final boni m49002a(String str, String str2) {
        bxvd da = boni.f133807g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boni boni = (boni) da.f164949b;
        str.getClass();
        int i = boni.f133809a | 1;
        boni.f133809a = i;
        boni.f133810b = str;
        str2.getClass();
        boni.f133809a = i | 2;
        boni.f133811c = str2;
        if (((Boolean) this.f59695m.mo32596a()).booleanValue()) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                PackageInfo packageInfo = this.f59691i.getPackageInfo(str2, 134217728);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo != null) {
                    bonm bonm = (bonm) bonn.f133826e.mo74144da();
                    bonm.mo68918a(m49004a(signingInfo.getApkContentsSigners()));
                    bonm.mo68918a(m49004a(signingInfo.getSigningCertificateHistory()));
                    boolean hasMultipleSigners = signingInfo.hasMultipleSigners();
                    if (bonm.f164950c) {
                        bonm.mo74035c();
                        bonm.f164950c = false;
                    }
                    bonn bonn = (bonn) bonm.f164949b;
                    bonn.f133828a |= 1;
                    bonn.f133830c = hasMultipleSigners;
                    boolean hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
                    if (bonm.f164950c) {
                        bonm.mo74035c();
                        bonm.f164950c = false;
                    }
                    bonn bonn2 = (bonn) bonm.f164949b;
                    bonn2.f133828a |= 2;
                    bonn2.f133831d = hasPastSigningCertificates;
                    bonn bonn3 = (bonn) bonm.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boni boni2 = (boni) da.f164949b;
                    bonn3.getClass();
                    boni2.f133814f = bonn3;
                    boni2.f133809a |= 32;
                }
                long j = packageInfo.lastUpdateTime;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boni boni3 = (boni) da.f164949b;
                boni3.f133809a |= 4;
                boni3.f133812d = j;
                int i3 = packageInfo.versionCode;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boni boni4 = (boni) da.f164949b;
                boni4.f133809a |= 8;
                boni4.f133813e = i3;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(str2);
                Log.w("AppsUpload", valueOf.length() == 0 ? new String("Failed to get PackageInfo for Package Name ") : "Failed to get PackageInfo for Package Name ".concat(valueOf), e);
            }
        } else {
            try {
                PackageInfo packageInfo2 = this.f59691i.getPackageInfo(str2, 0);
                long j2 = packageInfo2.lastUpdateTime;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boni boni5 = (boni) da.f164949b;
                boni5.f133809a |= 4;
                boni5.f133812d = j2;
                int i4 = packageInfo2.versionCode;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boni boni6 = (boni) da.f164949b;
                boni6.f133809a |= 8;
                boni6.f133813e = i4;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf2 = String.valueOf(str2);
                Log.w("AppsUpload", valueOf2.length() == 0 ? new String("Failed to get PackageInfo for Package Name ") : "Failed to get PackageInfo for Package Name ".concat(valueOf2), e2);
            }
        }
        return (boni) da.mo74062i();
    }

    /* renamed from: a */
    private final bonk m49003a() {
        String str;
        long a = cemd.f182957a.mo6606a().mo79321a();
        int b = (int) cemd.f182957a.mo6606a().mo79322b();
        bonj bonj = (bonj) bonk.f133815e.mo74144da();
        int i = 0;
        while (((long) ((bonk) bonj.f164949b).f133819b.size()) < a) {
            try {
                SearchResults searchResults = (SearchResults) aucu.m76783a(this.f59696n.mo47578a("", "com.google.android.gms", f59684g, i, b, f59685h), 5, TimeUnit.SECONDS);
                if (searchResults != null && !searchResults.mo7231a()) {
                    fsn b2 = searchResults.iterator();
                    while (b2.hasNext() && ((long) ((bonk) bonj.f164949b).f133819b.size()) < a) {
                        C1001fsm a2 = b2.next();
                        bonj.mo68917a(m49002a(a2.mo11253b("name"), a2.mo11253b("package_name")));
                    }
                    if (searchResults.f9670g < b) {
                        break;
                    }
                    i += b;
                } else {
                    ((bads) this.f59687b.mo16713a()).mo32743a(12004);
                    if (searchResults != null) {
                        str = searchResults.f9664a;
                    } else {
                        str = null;
                    }
                    String valueOf = String.valueOf(str);
                    throw new aceu(valueOf.length() == 0 ? new String("Apps corpus query search result error: ") : "Apps corpus query search result error: ".concat(valueOf));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((bads) this.f59687b.mo16713a()).mo32743a(12003);
                throw new aceu("Apps corpus query failure", e);
            }
        }
        String a3 = m49005a(Build.MODEL);
        if (bonj.f164950c) {
            bonj.mo74035c();
            bonj.f164950c = false;
        }
        bonk bonk = (bonk) bonj.f164949b;
        a3.getClass();
        bonk.f133818a |= 2;
        bonk.f133821d = a3;
        return (bonk) bonj.mo74062i();
    }

    /* renamed from: a */
    private static Iterable m49004a(Signature[] signatureArr) {
        if (signatureArr == null) {
            return Collections.emptyList();
        }
        bngs j = bngx.m109377j();
        try {
            for (Signature signature : signatureArr) {
                bxvd da = bonl.f133822c.mo74144da();
                byte[] byteArray = signature.toByteArray();
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(byteArray);
                ByteString a = ByteString.m123261a(instance.digest());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bonl bonl = (bonl) da.f164949b;
                a.getClass();
                bonl.f133824a |= 1;
                bonl.f133825b = a;
                j.mo67668c((bonl) da.mo74062i());
            }
            return j.mo67664a();
        } catch (NoSuchAlgorithmException e) {
            Log.w("AppsUpload", "Failed to digest signature.", e);
            return Collections.emptyList();
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:584)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:490)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:253)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:194)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:208)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:340)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:293)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:262)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:258)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:249)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:229)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:84)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:60)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:314)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:293)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac A[SYNTHETIC] */
    /* renamed from: a */
    static synchronized java.lang.String m49005a(java.lang.String r6) {
        /*
            java.lang.Class<acev> r0 = p000.acev.class
            monitor-enter(r0)
            if (r6 == 0) goto L_0x00d2
            cemd r1 = p000.cemd.f182957a     // Catch:{ all -> 0x00d6 }
            ceme r1 = r1.mo6606a()     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r1.mo79323c()     // Catch:{ all -> 0x00d6 }
            cemd r2 = p000.cemd.f182957a     // Catch:{ all -> 0x00d6 }
            ceme r2 = r2.mo6606a()     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = r2.mo79324d()     // Catch:{ all -> 0x00d6 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x00d6 }
            r4 = 0
            if (r3 != 0) goto L_0x003b
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            bymt r3 = new bymt     // Catch:{ all -> 0x00d6 }
            r5 = 124(0x7c, float:1.74E-43)
            bmyx r5 = p000.bmyx.m108640a(r5)     // Catch:{ all -> 0x00d6 }
            java.lang.Iterable r2 = r5.mo66918a(r2)     // Catch:{ all -> 0x00d6 }
            java.util.ArrayList r2 = p000.bnkn.m109663a(r2)     // Catch:{ all -> 0x00d6 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x00d6 }
            goto L_0x0071
        L_0x003b:
            bymt r3 = new bymt     // Catch:{ all -> 0x00d6 }
            r1 = 8
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = "Sony"
            r1[r4] = r2     // Catch:{ all -> 0x00d6 }
            r2 = 1
            java.lang.String r5 = "HTC"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 2
            java.lang.String r5 = "Samsung"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 3
            java.lang.String r5 = "sonyericsson"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 4
            java.lang.String r5 = "MICROMAX"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 5
            java.lang.String r5 = "huawei"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 6
            java.lang.String r5 = "nook"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 7
            java.lang.String r5 = "ZTE"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = " -_"
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x00d6 }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x00d6 }
        L_0x0071:
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00d6 }
            if (r6 == 0) goto L_0x0082
            java.lang.String r1 = r3.f167073a     // Catch:{ all -> 0x00d6 }
            bmwx r1 = p000.bmwx.m108504f(r1)     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r1.mo66837d(r6)     // Catch:{ all -> 0x00d6 }
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            java.lang.String r6 = p000.bymt.m124967a(r6, r1)     // Catch:{ all -> 0x00d6 }
            bngx r1 = r3.f167074b     // Catch:{ all -> 0x00d6 }
            bnre r1 = r1.listIterator()     // Catch:{ all -> 0x00d6 }
        L_0x008d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00d6 }
            boolean r3 = r6.startsWith(r2)     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x008d
            int r1 = r2.length()     // Catch:{ all -> 0x00d6 }
            int r2 = r6.length()     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r6.substring(r1, r2)     // Catch:{ all -> 0x00d6 }
            goto L_0x00ad
        L_0x00ac:
            r1 = r6
        L_0x00ad:
            java.lang.String r6 = p000.bymt.m124967a(r6, r1)     // Catch:{ all -> 0x00d6 }
            r1 = 47
            int r1 = r6.indexOf(r1)     // Catch:{ all -> 0x00d6 }
            r2 = -1
            if (r1 == r2) goto L_0x00bf
            java.lang.String r1 = r6.substring(r4, r1)     // Catch:{ all -> 0x00d6 }
            goto L_0x00c0
        L_0x00bf:
            r1 = r6
        L_0x00c0:
            int r2 = r1.length()     // Catch:{ all -> 0x00d6 }
            r3 = 16
            if (r2 <= r3) goto L_0x00cc
            java.lang.String r1 = r1.substring(r4, r3)     // Catch:{ all -> 0x00d6 }
        L_0x00cc:
            java.lang.String r6 = p000.bymt.m124967a(r6, r1)     // Catch:{ all -> 0x00d6 }
            monitor-exit(r0)
            return r6
        L_0x00d2:
            java.lang.String r6 = ""
            monitor-exit(r0)
            return r6
        L_0x00d6:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x00da
        L_0x00d9:
            throw r6
        L_0x00da:
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.acev.m49005a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final bqgg mo32716a(Bundle bundle) {
        boolean z;
        bonk bonk;
        String str;
        bonj bonj;
        if (!acwx.m49915a()) {
            z = ((Boolean) acaw.f59389i.mo58455c()).booleanValue();
        } else {
            z = ((Boolean) acaw.f59392l.mo58455c()).booleanValue();
        }
        if (z) {
            try {
                if (((Boolean) this.f59693k.mo32596a()).booleanValue()) {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    int i = Build.VERSION.SDK_INT;
                    if (!((Boolean) this.f59692j.mo6606a()).booleanValue()) {
                        str = "android.intent.category.LAUNCHER";
                    } else {
                        str = "android.intent.category.LEANBACK_LAUNCHER";
                    }
                    intent.addCategory(str);
                    bonj = (bonj) bonk.f133815e.mo74144da();
                    String a = m49005a(Build.MODEL);
                    if (bonj.f164950c) {
                        bonj.mo74035c();
                        bonj.f164950c = false;
                    }
                    bonk bonk2 = (bonk) bonj.f164949b;
                    a.getClass();
                    bonk2.f133818a |= 2;
                    bonk2.f133821d = a;
                    for (ResolveInfo resolveInfo : this.f59691i.queryIntentActivities(intent, 0)) {
                        bonj.mo68917a(m49002a(resolveInfo.loadLabel(this.f59691i).toString(), resolveInfo.activityInfo.applicationInfo.packageName));
                    }
                    bonk = (bonk) bonj.mo74062i();
                } else {
                    bonk = m49003a();
                }
            } catch (Exception e) {
                if (!((Boolean) this.f59694l.mo32596a()).booleanValue()) {
                    bonk = (bonk) bonj.mo74062i();
                } else {
                    throw e;
                }
            } catch (aceu e2) {
                Log.e("AppsUpload", "Failed to upload apps list", e2);
                return bqga.m112775a((Object) null);
            }
            return bqdx.m112674a(bqdx.m112673a(this.f59697o.mo32705a(), new acer(this), this.f59688c), new aceq(this, bonk, bundle), this.f59688c);
        }
        Log.v("AppsUpload", "Apps upload disabled");
        return bqga.m112775a((Object) null);
    }
}
