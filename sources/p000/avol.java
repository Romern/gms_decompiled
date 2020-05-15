package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: avol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avol extends avnn {

    /* renamed from: e */
    private static final Logger f93629e = avpq.m79018e("PreDownloadValidateAction");

    /* renamed from: f */
    private static final avtg f93630f = new avtg("network_error_attempts", 0);

    /* renamed from: g */
    private final Context f93631g;

    /* renamed from: h */
    private final avmx f93632h = ((avmx) avmx.f93453h.mo51589b());

    public avol(Context context, avte avte) {
        super("pre-download-validate", avte);
        this.f93631g = context;
    }

    /* renamed from: e */
    private static avni m78927e() {
        if (!cfsg.m142822i() || bmxx.m108577a((String) avma.f93363i.mo51364a())) {
            return new avni("non-streaming-download", avte.m79305a(new avtc[0]));
        }
        return new avni("streaming-download", avte.m79305a(new avtc[0]));
    }

    /* renamed from: f */
    private static avni m78928f() {
        return new avni("finished-execution", avte.m79305a(new avtc[0]));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
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
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0353, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0240, code lost:
        r4 = (java.util.Map.Entry) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0252, code lost:
        r0 = p000.bmxv.m108566b((java.lang.String) r4.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x025d, code lost:
        r0 = p000.bmvz.f131120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0265, code lost:
        r0 = mo51432a().mo51598b();
        r0.mo51594a(p000.avol.f93630f, java.lang.Integer.valueOf(((java.lang.Integer) mo51433a(p000.avol.f93630f)).intValue() + 1));
        r0 = r0.mo51593a();
        r1.f93632h.mo51402a(278, -1.0d);
        r2 = p000.avny.m78899f();
        r2.mo51451a(p000.cfsd.m142761d(), p000.cfsd.m142762e());
        r2.mo51449a(p000.cfsd.m142763f());
        r2.mo51450a(((java.lang.Integer) mo51433a(p000.avol.f93630f)).intValue());
        r2.mo51446a("pre-download-validate", r0);
        r0 = r2.mo51447b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02ba, code lost:
        ((p000.avtn) p000.avtn.f93892a.mo51589b()).mo51605a(p000.avnp.f93539n.mo51602b(java.lang.Boolean.valueOf(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02d3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = (p000.avst) p000.GeneratedMessageLite.m124014a(p000.avst.f93854b, p000.sqd.m35966a((java.lang.String) r0.mo66814b()));
        r2 = p000.avol.f93629e;
        r3 = new java.lang.Object[1];
        r4 = p000.avss.m79283a(r0.f93856a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02f0, code lost:
        if (r4 != 0) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02f3, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f4, code lost:
        if (r4 != 1) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02f6, code lost:
        r4 = "REJECT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02f9, code lost:
        r4 = "UNKNOWN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02fb, code lost:
        r3[0] = r4;
        r2.mo25418e("Failed to validate package, with resolution=%s.", r3);
        r0 = p000.avss.m79283a(r0.f93856a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0308, code lost:
        if (r0 != 0) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x030b, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x030e, code lost:
        if ((r0 - 1) != 1) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0310, code lost:
        p000.avol.f93629e.mo25412b("Unknown package validation resolution.", new java.lang.Object[0]);
        r0 = m78927e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031e, code lost:
        r1.f93632h.mo51402a(22, -1.0d);
        r0 = m78928f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x033a, code lost:
        ((p000.avtn) p000.avtn.f93892a.mo51589b()).mo51605a(p000.avnp.f93539n.mo51602b(java.lang.Boolean.valueOf(r7)));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x025d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3 A[Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0176 A[Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0240 A[Catch:{ bxwf -> 0x032c, all -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0265 A[Catch:{ bxwf -> 0x032c, all -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02d4 A[SYNTHETIC, Splitter:B:78:0x02d4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x01a8=Splitter:B:54:0x01a8, B:59:0x01db=Splitter:B:59:0x01db} */
    /* renamed from: c */
    public final p000.avni mo51435c() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Failed to download."
            java.lang.String r3 = "pre-download-validate"
            cfsg r0 = p000.cfsg.f185570a
            cfsh r0 = r0.mo6606a()
            boolean r0 = r0.mo82639k()
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r6 = 0
            if (r0 != 0) goto L_0x001e
            avni r0 = m78927e()
            bmxv r0 = p000.bmxv.m108566b(r0)
            goto L_0x003c
        L_0x001e:
            avmx r0 = r1.f93632h
            com.google.android.gms.update.SystemUpdateStatus r0 = r0.mo51414d()
            java.lang.String r0 = r0.f109459a
            boolean r0 = p000.bmxx.m108577a(r0)
            if (r0 == 0) goto L_0x003a
            avmx r0 = r1.f93632h
            r0.mo51402a(r6, r4)
            avni r0 = m78928f()
            bmxv r0 = p000.bmxv.m108566b(r0)
            goto L_0x003c
        L_0x003a:
            bmvz r0 = p000.bmvz.f131120a
        L_0x003c:
            boolean r7 = r0.mo66813a()
            if (r7 == 0) goto L_0x0049
            java.lang.Object r0 = r0.mo66814b()
            avni r0 = (p000.avni) r0
            return r0
        L_0x0049:
            avmx r0 = r1.f93632h
            r7 = 23
            r0.mo51402a(r7, r4)
            avsz r0 = p000.avtn.f93892a
            java.lang.Object r0 = r0.mo51589b()
            avtn r0 = (p000.avtn) r0
            avta r7 = p000.avnp.f93539n
            avtc r0 = r0.mo51603a(r7)
            java.lang.Object r0 = r0.f93879b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r8 = 278(0x116, float:3.9E-43)
            r9 = 1
            boolean r0 = p000.avls.m78732a()     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            if (r0 == 0) goto L_0x00e6
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            if (r7 != 0) goto L_0x0083
            android.content.Context r0 = r1.f93631g     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            avmx r10 = r1.f93632h     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            com.google.android.gms.update.SystemUpdateStatus r10 = r10.mo51414d()     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            java.lang.String r10 = r10.f109459a     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            boolean r0 = p000.avow.m78971a(r0, r10)     // Catch:{ avpt -> 0x0226, avpu -> 0x01da, avps -> 0x01a7, all -> 0x01a4 }
            r7 = r0
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            if (r7 == 0) goto L_0x00e6
            cfsg r0 = p000.cfsg.f185570a     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            cfsh r0 = r0.mo6606a()     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            boolean r0 = r0.mo82641m()     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            if (r0 == 0) goto L_0x00e6
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            java.io.File r0 = new java.io.File     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            java.io.File r10 = p000.avov.m78963a()     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            java.lang.String r11 = "payload_metadata.bin"
            r0.<init>(r10, r11)     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            p000.avov.m78966a(r0)     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            avsz r10 = p000.avpn.f93713b     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            java.lang.Object r10 = r10.mo51589b()     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            avpn r10 = (p000.avpn) r10     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            sek r11 = p000.avpn.f93712a     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            java.lang.String r12 = "verifyPayloadMetadata()"
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            r11.mo25414c(r12, r13)     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            android.os.UpdateEngine r10 = r10.f93715d     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            boolean r0 = r10.verifyPayloadMetadata(r0)     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            if (r0 != 0) goto L_0x00cd
            sek r10 = p000.avol.f93629e     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            java.lang.String r11 = "UpdateEngine.verifyPayloadMetadata() failed."
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            r10.mo25418e(r11, r12)     // Catch:{ Exception -> 0x00ce, all -> 0x00da }
            goto L_0x00e7
        L_0x00cd:
            goto L_0x00e7
        L_0x00ce:
            r0 = move-exception
            sek r10 = p000.avol.f93629e     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            java.lang.String r11 = "UpdateEngine.verifyPayloadMetadata() exception."
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            r10.mo25417e(r11, r0, r12)     // Catch:{ avpt -> 0x00e3, avpu -> 0x00e0, avps -> 0x00dd, all -> 0x00da }
            r0 = 1
            goto L_0x00e7
        L_0x00da:
            r0 = move-exception
            goto L_0x0355
        L_0x00dd:
            r0 = move-exception
            goto L_0x01a8
        L_0x00e0:
            r0 = move-exception
            goto L_0x01db
        L_0x00e3:
            r0 = move-exception
            goto L_0x0227
        L_0x00e6:
            r0 = 1
        L_0x00e7:
            java.lang.String r10 = "metadata"
            bmxv r10 = p000.avpa.m78976a(r10)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            boolean r11 = r10.mo66813a()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            if (r11 == 0) goto L_0x0176
            java.lang.Object r10 = r10.mo66814b()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avly r10 = (p000.avly) r10     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            android.content.Context r11 = r1.f93631g     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            java.lang.String r12 = r10.f93350a     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            java.lang.String r13 = ""
            boolean r14 = p000.avlt.m78750c()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avos r11 = p000.avos.m78951a(r11, r12, r13, r14)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            bngs r12 = new bngs     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r12.<init>()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            android.content.Context r13 = r1.f93631g     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            bngx r13 = p000.avou.m78960a(r13)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r12.mo67666b(r13)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            java.lang.String r13 = "X-Package-Validation-Info"
            avsx r14 = p000.avsx.f93872c     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            bxvd r14 = r14.mo74144da()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r0 = r0 ^ r9
            boolean r15 = r14.f164950c     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            if (r15 != 0) goto L_0x0123
            goto L_0x0128
        L_0x0123:
            r14.mo74035c()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r14.f164950c = r6     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
        L_0x0128:
            GeneratedMessageLite r15 = r14.f164949b     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avsx r15 = (p000.avsx) r15     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            int r4 = r15.f93874a     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4 = r4 | r9
            r15.f93874a = r4     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r15.f93875b = r0     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            GeneratedMessageLite r0 = r14.mo74062i()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avsx r0 = (p000.avsx) r0     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            byte[] r0 = r0.mo73642k()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            java.lang.String r0 = p000.sqd.m35968b(r0)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            of r0 = p000.C1240of.m19758a(r13, r0)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r12.mo67668c(r0)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            bngx r0 = r12.mo67664a()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            android.content.Context r4 = r1.f93631g     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avpr r4 = p000.avpz.m79028a(r4)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avmx r5 = r1.f93632h     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            com.google.android.gms.update.SystemUpdateStatus r5 = r5.mo51414d()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            java.lang.String r5 = r5.f109459a     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4.f93728a = r5     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avot r5 = p000.avot.m78956a()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4.f93735h = r5     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4.f93729b = r11     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4.f93733f = r0     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            long r11 = r10.f93351b     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4.f93731d = r11     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            long r10 = r10.f93352c     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r4.f93732e = r10     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            avpz r0 = r4.mo51481a()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r0.mo51483a()     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            goto L_0x017f
        L_0x0176:
            sek r0 = p000.avol.f93629e     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            java.lang.String r4 = "Unable to get package metadata from the G-service flags."
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
            r0.mo25412b(r4, r5)     // Catch:{ avpt -> 0x01a1, avpu -> 0x019f, avps -> 0x019d }
        L_0x017f:
            avsz r0 = p000.avtn.f93892a
            java.lang.Object r0 = r0.mo51589b()
            avtn r0 = (p000.avtn) r0
            avtc[] r2 = new p000.avtc[r9]
            avta r3 = p000.avnp.f93539n
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            avtc r3 = r3.mo51602b(r4)
            r2[r6] = r3
            r0.mo51605a(r2)
            avni r0 = m78927e()
            return r0
        L_0x019d:
            r0 = move-exception
            goto L_0x01a8
        L_0x019f:
            r0 = move-exception
            goto L_0x01db
        L_0x01a1:
            r0 = move-exception
            goto L_0x0227
        L_0x01a4:
            r0 = move-exception
            goto L_0x0355
        L_0x01a7:
            r0 = move-exception
        L_0x01a8:
            sek r4 = p000.avol.f93629e     // Catch:{ all -> 0x0223 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0223 }
            r4.mo25417e(r2, r0, r5)     // Catch:{ all -> 0x0223 }
            avni r0 = new avni     // Catch:{ all -> 0x0223 }
            avte r2 = r16.mo51432a()     // Catch:{ all -> 0x0223 }
            avtd r2 = r2.mo51598b()     // Catch:{ all -> 0x0223 }
            avte r2 = r2.mo51593a()     // Catch:{ all -> 0x0223 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0223 }
            avsz r2 = p000.avtn.f93892a
            java.lang.Object r2 = r2.mo51589b()
            avtn r2 = (p000.avtn) r2
            avtc[] r3 = new p000.avtc[r9]
            avta r4 = p000.avnp.f93539n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            avtc r4 = r4.mo51602b(r5)
            r3[r6] = r4
            r2.mo51605a(r3)
            return r0
        L_0x01da:
            r0 = move-exception
        L_0x01db:
            sek r2 = p000.avol.f93629e     // Catch:{ all -> 0x0223 }
            java.lang.String r4 = "Unable to create the file."
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0223 }
            r2.mo25417e(r4, r0, r5)     // Catch:{ all -> 0x0223 }
            avmx r0 = r1.f93632h     // Catch:{ all -> 0x0223 }
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.mo51402a(r8, r4)     // Catch:{ all -> 0x0223 }
            avoa r0 = p000.avob.m78904f()     // Catch:{ all -> 0x0223 }
            long r4 = p000.cfsd.m142760c()     // Catch:{ all -> 0x0223 }
            r0.mo51452a(r4)     // Catch:{ all -> 0x0223 }
            avte r2 = r16.mo51432a()     // Catch:{ all -> 0x0223 }
            avtd r2 = r2.mo51598b()     // Catch:{ all -> 0x0223 }
            avte r2 = r2.mo51593a()     // Catch:{ all -> 0x0223 }
            r0.mo51446a(r3, r2)     // Catch:{ all -> 0x0223 }
            avni r0 = r0.mo51447b()     // Catch:{ all -> 0x0223 }
            avsz r2 = p000.avtn.f93892a
            java.lang.Object r2 = r2.mo51589b()
            avtn r2 = (p000.avtn) r2
            avtc[] r3 = new p000.avtc[r9]
            avta r4 = p000.avnp.f93539n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            avtc r4 = r4.mo51602b(r5)
            r3[r6] = r4
            r2.mo51605a(r3)
            return r0
        L_0x0223:
            r0 = move-exception
            goto L_0x0355
        L_0x0226:
            r0 = move-exception
        L_0x0227:
            sek r4 = p000.avol.f93629e     // Catch:{ all -> 0x0354 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0354 }
            r4.mo25417e(r2, r0, r5)     // Catch:{ all -> 0x0354 }
            bnhe r0 = r0.f93738a     // Catch:{ all -> 0x0354 }
            java.lang.String r2 = "X-Package-Validation-Error-Details"
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0354 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0354 }
        L_0x023a:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0354 }
            if (r4 == 0) goto L_0x025d
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0354 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0354 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0354 }
            boolean r5 = r5.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0354 }
            if (r5 == 0) goto L_0x023a
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0354 }
            bmxv r0 = p000.bmxv.m108566b(r0)     // Catch:{ all -> 0x0354 }
            goto L_0x025f
        L_0x025d:
            bmvz r0 = p000.bmvz.f131120a     // Catch:{ all -> 0x0354 }
        L_0x025f:
            boolean r2 = r0.mo66813a()     // Catch:{ all -> 0x0354 }
            if (r2 != 0) goto L_0x02d4
            avte r0 = r16.mo51432a()     // Catch:{ all -> 0x0354 }
            avtd r0 = r0.mo51598b()     // Catch:{ all -> 0x0354 }
            avtg r2 = p000.avol.f93630f     // Catch:{ all -> 0x0354 }
            avtg r4 = p000.avol.f93630f     // Catch:{ all -> 0x0354 }
            java.lang.Object r4 = r1.mo51433a(r4)     // Catch:{ all -> 0x0354 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0354 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0354 }
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0354 }
            r0.mo51594a(r2, r4)     // Catch:{ all -> 0x0354 }
            avte r0 = r0.mo51593a()     // Catch:{ all -> 0x0354 }
            avmx r2 = r1.f93632h     // Catch:{ all -> 0x0354 }
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r2.mo51402a(r8, r4)     // Catch:{ all -> 0x0354 }
            avnx r2 = p000.avny.m78899f()     // Catch:{ all -> 0x0354 }
            long r4 = p000.cfsd.m142761d()     // Catch:{ all -> 0x0354 }
            long r10 = p000.cfsd.m142762e()     // Catch:{ all -> 0x0354 }
            r2.mo51451a(r4, r10)     // Catch:{ all -> 0x0354 }
            double r4 = p000.cfsd.m142763f()     // Catch:{ all -> 0x0354 }
            r2.mo51449a(r4)     // Catch:{ all -> 0x0354 }
            avtg r4 = p000.avol.f93630f     // Catch:{ all -> 0x0354 }
            java.lang.Object r4 = r1.mo51433a(r4)     // Catch:{ all -> 0x0354 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0354 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0354 }
            r2.mo51450a(r4)     // Catch:{ all -> 0x0354 }
            r2.mo51446a(r3, r0)     // Catch:{ all -> 0x0354 }
            avni r0 = r2.mo51447b()     // Catch:{ all -> 0x0354 }
            avsz r2 = p000.avtn.f93892a
            java.lang.Object r2 = r2.mo51589b()
            avtn r2 = (p000.avtn) r2
            avtc[] r3 = new p000.avtc[r9]
            avta r4 = p000.avnp.f93539n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            avtc r4 = r4.mo51602b(r5)
            r3[r6] = r4
            r2.mo51605a(r3)
            return r0
        L_0x02d4:
            java.lang.Object r0 = r0.mo66814b()     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0354 }
            byte[] r0 = p000.sqd.m35966a(r0)     // Catch:{ bxwf -> 0x032c }
            avst r2 = p000.avst.f93854b     // Catch:{ bxwf -> 0x032c }
            GeneratedMessageLite r0 = p000.GeneratedMessageLite.m124014a(r2, r0)     // Catch:{ bxwf -> 0x032c }
            avst r0 = (p000.avst) r0     // Catch:{ bxwf -> 0x032c }
            sek r2 = p000.avol.f93629e     // Catch:{ bxwf -> 0x032c }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ bxwf -> 0x032c }
            int r4 = r0.f93856a     // Catch:{ bxwf -> 0x032c }
            int r4 = p000.avss.m79283a(r4)     // Catch:{ bxwf -> 0x032c }
            if (r4 == 0) goto L_0x02f3
            goto L_0x02f4
        L_0x02f3:
            r4 = 1
        L_0x02f4:
            if (r4 == r9) goto L_0x02f9
            java.lang.String r4 = "REJECT"
            goto L_0x02fb
        L_0x02f9:
            java.lang.String r4 = "UNKNOWN"
        L_0x02fb:
            r3[r6] = r4     // Catch:{ bxwf -> 0x032c }
            java.lang.String r4 = "Failed to validate package, with resolution=%s."
            r2.mo25418e(r4, r3)     // Catch:{ bxwf -> 0x032c }
            int r0 = r0.f93856a     // Catch:{ bxwf -> 0x032c }
            int r0 = p000.avss.m79283a(r0)     // Catch:{ bxwf -> 0x032c }
            if (r0 == 0) goto L_0x030b
            goto L_0x030c
        L_0x030b:
            r0 = 1
        L_0x030c:
            int r0 = r0 + -1
            if (r0 == r9) goto L_0x031e
            sek r0 = p000.avol.f93629e     // Catch:{ bxwf -> 0x032c }
            java.lang.String r2 = "Unknown package validation resolution."
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ bxwf -> 0x032c }
            r0.mo25412b(r2, r3)     // Catch:{ bxwf -> 0x032c }
            avni r0 = m78927e()     // Catch:{ bxwf -> 0x032c }
            goto L_0x033a
        L_0x031e:
            avmx r0 = r1.f93632h     // Catch:{ bxwf -> 0x032c }
            r2 = 22
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.mo51402a(r2, r3)     // Catch:{ bxwf -> 0x032c }
            avni r0 = m78928f()     // Catch:{ bxwf -> 0x032c }
            goto L_0x033a
        L_0x032c:
            r0 = move-exception
            sek r2 = p000.avol.f93629e     // Catch:{ all -> 0x0354 }
            java.lang.String r3 = "Unable to parse the proto value for ErrorDetails proto."
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0354 }
            r2.mo25417e(r3, r0, r4)     // Catch:{ all -> 0x0354 }
            avni r0 = m78927e()     // Catch:{ all -> 0x0354 }
        L_0x033a:
            avsz r2 = p000.avtn.f93892a
            java.lang.Object r2 = r2.mo51589b()
            avtn r2 = (p000.avtn) r2
            avtc[] r3 = new p000.avtc[r9]
            avta r4 = p000.avnp.f93539n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            avtc r4 = r4.mo51602b(r5)
            r3[r6] = r4
            r2.mo51605a(r3)
            return r0
        L_0x0354:
            r0 = move-exception
        L_0x0355:
            avsz r2 = p000.avtn.f93892a
            java.lang.Object r2 = r2.mo51589b()
            avtn r2 = (p000.avtn) r2
            avtc[] r3 = new p000.avtc[r9]
            avta r4 = p000.avnp.f93539n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            avtc r4 = r4.mo51602b(r5)
            r3[r6] = r4
            r2.mo51605a(r3)
            goto L_0x0370
        L_0x036f:
            throw r0
        L_0x0370:
            goto L_0x036f
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.avol.mo51435c():avni");
    }
}
