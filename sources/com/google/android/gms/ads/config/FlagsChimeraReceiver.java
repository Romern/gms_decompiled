package com.google.android.gms.ads.config;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0362f;
import com.google.android.gms.ads.internal.config.C0365i;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagsChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private final String f7936b;

    public FlagsChimeraReceiver() {
        this("/system/etc/security/otacerts.zip");
    }

    /* renamed from: a */
    private static final boolean m5095a(PublicKey publicKey, String str, String str2) {
        Signature instance = Signature.getInstance("SHA1withRSA");
        instance.initVerify(publicKey);
        instance.update(str.getBytes("UTF-8"));
        return instance.verify(Base64.decode(str2, 0));
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
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:362)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        r0 = p000.spo.m35903a("MD5");
        r15 = new byte[2048];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r11 = r14.read(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r11 > 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r0 = java.util.Arrays.equals(r0.digest(), new java.math.BigInteger("4033dafc873dc7271e205b83cc9b4b17", 16).toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r14.close();
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r0 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.update(r15, 0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r14.close();
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0169, code lost:
        if (r10.mo6441a().contains(r9) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4 A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012e A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019f A[Catch:{ UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d8 A[Catch:{ UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0206 A[SYNTHETIC, Splitter:B:92:0x0206] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022d A[Catch:{ UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x0242 }] */
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r1 = r17
            com.google.android.gms.ads.internal.config.C0371o.m5339a(r17)
            java.lang.String r0 = r18.getAction()
            java.lang.String r2 = "com.google.android.gms.ads.config.FLAG_RESET"
            boolean r0 = r2.equals(r0)
            java.lang.String r2 = "{}"
            java.lang.String r3 = "flag_configuration"
            if (r0 != 0) goto L_0x025b
            java.lang.String r0 = r18.getAction()
            java.lang.String r4 = "com.google.android.gms.ads.config.FLAG_OVERRIDE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0258
            android.os.Bundle r0 = r18.getExtras()     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.lang.String r4 = "flag"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.lang.String r5 = "value"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.lang.String r6 = "sig"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            if (r0 != 0) goto L_0x0248
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            if (r0 != 0) goto L_0x0248
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            cbte r7 = p000.cbte.f178261a     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            cbtf r7 = r7.mo6606a()     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.lang.String r7 = r7.mo75361a()     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            r8 = 0
            byte[] r7 = android.util.Base64.decode(r7, r8)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            r0.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.lang.String r7 = "RSA"
            java.security.KeyFactory r7 = java.security.KeyFactory.getInstance(r7)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.security.PublicKey r7 = r7.generatePublic(r0)     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.lang.String r9 = android.os.Build.getSerial()     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            com.google.android.gms.ads.config.b r10 = new com.google.android.gms.ads.config.b     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x024f, GeneralSecurityException -> 0x024d, UnsupportedEncodingException -> 0x024b }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00e6 }
            r12 = r16
            java.lang.String r13 = r12.f7936b     // Catch:{ Exception -> 0x00e4 }
            r0.<init>(r13)     // Catch:{ Exception -> 0x00e4 }
            boolean r13 = r0.isFile()     // Catch:{ Exception -> 0x00e4 }
            if (r13 == 0) goto L_0x00ee
            boolean r13 = r0.canRead()     // Catch:{ Exception -> 0x00e4 }
            if (r13 == 0) goto L_0x00ee
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00e4 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x00e4 }
            java.util.zip.ZipInputStream r14 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00e4 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x00e4 }
        L_0x008b:
            java.util.zip.ZipEntry r0 = r14.getNextEntry()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00dc }
            java.lang.String r15 = "testkey.x509.pem"
            boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = p000.spo.m35903a(r0)     // Catch:{ all -> 0x00dc }
            r15 = 2048(0x800, float:2.87E-42)
            byte[] r15 = new byte[r15]     // Catch:{ all -> 0x00dc }
        L_0x00a7:
            int r11 = r14.read(r15)     // Catch:{ all -> 0x00dc }
            if (r11 > 0) goto L_0x00cc
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x00dc }
            java.math.BigInteger r11 = new java.math.BigInteger     // Catch:{ all -> 0x00dc }
            java.lang.String r15 = "4033dafc873dc7271e205b83cc9b4b17"
            r8 = 16
            r11.<init>(r15, r8)     // Catch:{ all -> 0x00dc }
            byte[] r8 = r11.toByteArray()     // Catch:{ all -> 0x00dc }
            boolean r0 = java.util.Arrays.equals(r0, r8)     // Catch:{ all -> 0x00dc }
            r14.close()     // Catch:{ Exception -> 0x00e4 }
            r13.close()     // Catch:{ Exception -> 0x00e4 }
            if (r0 == 0) goto L_0x00ee
            goto L_0x01a5
        L_0x00cc:
            r8 = 0
            r0.update(r15, r8, r11)     // Catch:{ all -> 0x00dc }
            r8 = 0
            goto L_0x00a7
        L_0x00d3:
            r8 = 0
            goto L_0x008b
        L_0x00d5:
            r14.close()     // Catch:{ Exception -> 0x00e4 }
            r13.close()     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00ee
        L_0x00dc:
            r0 = move-exception
            r14.close()     // Catch:{ Exception -> 0x00e4 }
            r13.close()     // Catch:{ Exception -> 0x00e4 }
            throw r0     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            r12 = r16
        L_0x00e9:
            java.lang.String r8 = "Exception in testkey check"
            com.google.android.gms.ads.internal.util.client.C0633h.m5671c(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
        L_0x00ee:
            java.util.List r0 = r10.mo6441a()     // Catch:{ Exception -> 0x016c }
            if (r0 == 0) goto L_0x012a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c }
            r8.<init>()     // Catch:{ Exception -> 0x016c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x016c }
        L_0x00fd:
            boolean r11 = r0.hasNext()     // Catch:{ Exception -> 0x016c }
            if (r11 != 0) goto L_0x011b
            java.util.ArrayList r0 = r10.f7944a     // Catch:{ Exception -> 0x016c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x016c }
            java.util.ArrayList r11 = r10.f7944a     // Catch:{ Exception -> 0x016c }
            int r0 = r0 + -2
            java.lang.Object r0 = r11.get(r0)     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x016c }
            r8.append(r0)     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x016c }
            goto L_0x012b
        L_0x011b:
            java.lang.Object r11 = r0.next()     // Catch:{ Exception -> 0x016c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x016c }
            r8.append(r11)     // Catch:{ Exception -> 0x016c }
            java.lang.String r11 = "\n"
            r8.append(r11)     // Catch:{ Exception -> 0x016c }
            goto L_0x00fd
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 != 0) goto L_0x012e
            goto L_0x0172
        L_0x012e:
            java.util.ArrayList r8 = r10.f7944a     // Catch:{ Exception -> 0x016c }
            if (r8 == 0) goto L_0x0149
            boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x016c }
            if (r8 != 0) goto L_0x0149
            java.util.ArrayList r8 = r10.f7944a     // Catch:{ Exception -> 0x016c }
            int r8 = r8.size()     // Catch:{ Exception -> 0x016c }
            java.util.ArrayList r11 = r10.f7944a     // Catch:{ Exception -> 0x016c }
            int r8 = r8 + -1
            java.lang.Object r8 = r11.get(r8)     // Catch:{ Exception -> 0x016c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x016c }
            goto L_0x014a
        L_0x0149:
            r8 = 0
        L_0x014a:
            if (r8 == 0) goto L_0x0172
            boolean r0 = m5095a(r7, r0, r8)     // Catch:{ Exception -> 0x016c }
            if (r0 == 0) goto L_0x0172
            java.util.Date r0 = r10.mo6442b()     // Catch:{ Exception -> 0x016c }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x016c }
            r8.<init>()     // Catch:{ Exception -> 0x016c }
            boolean r0 = r0.before(r8)     // Catch:{ Exception -> 0x016c }
            if (r0 != 0) goto L_0x0172
            java.util.List r0 = r10.mo6441a()     // Catch:{ Exception -> 0x016c }
            boolean r0 = r0.contains(r9)     // Catch:{ Exception -> 0x016c }
            if (r0 != 0) goto L_0x01a5
            goto L_0x0172
        L_0x016c:
            r0 = move-exception
            java.lang.String r8 = "Exception in devicekey check"
            com.google.android.gms.ads.internal.util.client.C0633h.m5671c(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
        L_0x0172:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            int r0 = r0.length()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            int r8 = r8.length()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            int r0 = r0 + 1
            int r0 = r0 + r8
            r9.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r9.append(r4)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r0 = "="
            r9.append(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r9.append(r5)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r0 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            boolean r0 = m5095a(r7, r0, r6)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            if (r0 != 0) goto L_0x01a5
            java.lang.String r0 = "Attempt to override a flag with an invalid signature."
            com.google.android.gms.ads.internal.util.client.C0633h.m5672d(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            return
        L_0x01a5:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            int r0 = r0.length()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            int r0 = r0 + 32
            r6.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r0 = "Overriding the value of flag '"
            r6.append(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r6.append(r4)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r0 = "'."
            r6.append(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r0 = r6.toString()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            com.google.android.gms.ads.internal.util.client.C0633h.m5670c(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            com.google.android.gms.ads.internal.config.h r0 = com.google.android.gms.ads.internal.client.C0341h.m5275b()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.util.Collection r0 = r0.f8171a     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
        L_0x01d2:
            boolean r6 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            if (r6 == 0) goto L_0x01e7
            java.lang.Object r6 = r0.next()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            com.google.android.gms.ads.internal.config.f r6 = (com.google.android.gms.ads.internal.config.C0362f) r6     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            java.lang.String r7 = r6.f8167b     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            boolean r7 = r4.equals(r7)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            if (r7 == 0) goto L_0x01d2
            goto L_0x01e8
        L_0x01e7:
            r6 = 0
        L_0x01e8:
            com.google.android.gms.ads.internal.client.C0341h.m5278e()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            android.content.SharedPreferences r0 = com.google.android.gms.ads.internal.config.C0365i.m5332a(r17)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            android.content.SharedPreferences$Editor r7 = r0.edit()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0203 }
            java.lang.String r0 = r0.getString(r3, r2)     // Catch:{ JSONException -> 0x0203 }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x0203 }
            r8 = r9
            goto L_0x0204
        L_0x0203:
            r0 = move-exception
        L_0x0204:
            if (r6 != 0) goto L_0x022d
            com.google.android.gms.ads.config.a r0 = new com.google.android.gms.ads.config.a     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.f7941c = r7     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.f7939a = r4     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.f7940b = r5     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r2 = 0
            r0.f7942d = r2     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            com.google.android.gms.ads.internal.flag.C0389b.m5383a(r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r2 = 0
            r0.f7941c = r2     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.f7939a = r2     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.f7940b = r2     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            int r0 = r0.f7942d     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            if (r0 <= 0) goto L_0x0223
            goto L_0x0233
        L_0x0223:
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.config.f r0 = com.google.android.gms.ads.internal.config.C0362f.m5317a(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r0.mo6603a(r8, r5)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            goto L_0x0233
        L_0x022d:
            r6.mo6602a(r7, r5)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r6.mo6603a(r8, r5)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
        L_0x0233:
            java.lang.String r0 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            r7.putString(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            com.google.android.gms.ads.internal.client.C0341h.m5278e()     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            com.google.android.gms.ads.internal.config.C0365i.m5333a(r1, r7)     // Catch:{ IllegalArgumentException -> 0x0246, GeneralSecurityException -> 0x0244, UnsupportedEncodingException -> 0x0242 }
            return
        L_0x0242:
            r0 = move-exception
            goto L_0x0252
        L_0x0244:
            r0 = move-exception
            goto L_0x0252
        L_0x0246:
            r0 = move-exception
            goto L_0x0252
        L_0x0248:
            r12 = r16
            return
        L_0x024b:
            r0 = move-exception
            goto L_0x0250
        L_0x024d:
            r0 = move-exception
            goto L_0x0250
        L_0x024f:
            r0 = move-exception
        L_0x0250:
            r12 = r16
        L_0x0252:
            java.lang.String r1 = "Unable to override flag value."
            com.google.android.gms.ads.internal.util.client.C0633h.m5673d(r1, r0)
            return
        L_0x0258:
            r12 = r16
            return
        L_0x025b:
            r12 = r16
            com.google.android.gms.ads.internal.client.C0341h.m5278e()
            android.content.SharedPreferences r0 = com.google.android.gms.ads.internal.config.C0365i.m5332a(r17)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.util.Collection r4 = com.google.android.gms.ads.internal.config.C0371o.m5343c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0270:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0282
            java.lang.Object r5 = r4.next()
            com.google.android.gms.ads.internal.config.f r5 = (com.google.android.gms.ads.internal.config.C0362f) r5
            java.lang.Object r6 = r5.f8168c
            r5.mo6601a(r0, r6)
            goto L_0x0270
        L_0x0282:
            r0.putString(r3, r2)
            com.google.android.gms.ads.internal.client.C0341h.m5278e()
            com.google.android.gms.ads.internal.config.C0365i.m5333a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.config.FlagsChimeraReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public FlagsChimeraReceiver(String str) {
        this.f7936b = str;
    }
}
