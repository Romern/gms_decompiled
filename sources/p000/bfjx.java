package p000;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: bfjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjx {

    /* renamed from: a */
    public final List f114239a;

    /* renamed from: b */
    private final bgmk f114240b;

    /* renamed from: c */
    private final bfjf f114241c;

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
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:239)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb A[SYNTHETIC] */
    /* renamed from: b */
    private final p000.bfjw m97068b(java.util.Calendar r21) {
        /*
            r20 = this;
            r0 = r20
            r8 = r21
            bfjf r1 = r0.f114241c
            bsax r1 = r1.mo61791d()
            r2 = 0
            r9 = 1
            if (r1 == 0) goto L_0x0014
            long r4 = r1.mo70124c(r9)
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x001d
            r4 = r2
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r10.setTimeInMillis(r4)
            boolean r1 = r10.after(r8)
            if (r1 == 0) goto L_0x003a
            r1 = 12
            r4 = -5
            r10.add(r1, r4)
            boolean r1 = r10.after(r8)
            if (r1 == 0) goto L_0x003a
            r10.setTimeInMillis(r2)
        L_0x003a:
            boolean r11 = p000.bfla.m97165a(r8, r10)
            java.util.List r12 = r0.f114239a
            int r13 = r12.size()
            r14 = 0
            r15 = 0
        L_0x0046:
            r16 = 0
            if (r15 >= r13) goto L_0x0115
            java.lang.Object r1 = r12.get(r15)
            r2 = r1
            bfla r2 = (p000.bfla) r2
            boolean r1 = r2.mo61868a(r8)
            if (r1 == 0) goto L_0x005b
            r19 = r15
            goto L_0x0110
        L_0x005b:
            if (r11 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            boolean r1 = r2.mo61869b(r10)
            if (r1 != 0) goto L_0x010e
        L_0x0064:
            bgmk r1 = r0.f114240b
            long r6 = r1.mo62777d()
            java.util.List r1 = r0.f114239a
            java.lang.Object r1 = r1.get(r14)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00d6
            bfjf r1 = r0.f114241c
            java.util.Map r1 = r1.mo61801n()
            if (r1 == 0) goto L_0x00d3
            r3 = 7
            int r4 = r8.get(r3)
            if (r4 == r3) goto L_0x00d0
            int r3 = r8.get(r3)
            if (r3 == r9) goto L_0x00cd
            java.lang.Object r3 = r21.clone()
            java.util.Calendar r3 = (java.util.Calendar) r3
            long r4 = r2.f114327a
            p000.bfla.m97164a(r3, r4)
            java.util.Random r4 = new java.util.Random
            long r17 = r3.getTimeInMillis()
            r19 = r15
            long r14 = r6 ^ r17
            r4.<init>(r14)
            double r3 = r4.nextDouble()
            r14 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b1
            goto L_0x00d8
        L_0x00b1:
            p000.bmxy.m108581a(r1)
            bfjz r14 = new bfjz
            java.util.TimeZone r3 = r21.getTimeZone()
            java.lang.String r3 = r3.getID()
            java.lang.Object r1 = r1.get(r3)
            r3 = r1
            bngx r3 = (p000.bngx) r3
            r4 = 2
            r1 = r14
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00e2
        L_0x00cd:
            r19 = r15
            goto L_0x00d8
        L_0x00d0:
            r19 = r15
            goto L_0x00d8
        L_0x00d3:
            r19 = r15
            goto L_0x00d8
        L_0x00d6:
            r19 = r15
        L_0x00d8:
            bfjz r14 = new bfjz
            r3 = 0
            r4 = 1
            r1 = r14
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x00e2:
            bngx r1 = r14.f114254b
            bnre r1 = r1.listIterator()
        L_0x00e8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()
            bfla r2 = (p000.bfla) r2
            boolean r3 = r2.mo61868a(r8)
            if (r3 != 0) goto L_0x00e8
            goto L_0x00fd
        L_0x00fb:
            r2 = r16
        L_0x00fd:
            if (r2 == 0) goto L_0x0110
            int r1 = r14.f114255c
            if (r1 == r9) goto L_0x0106
            bfju r1 = p000.bfju.USING_IN_OUTDOOR_HINTS
            goto L_0x0108
        L_0x0106:
            bfju r1 = p000.bfju.USING_FULL_TIME_SPANS
        L_0x0108:
            bfjw r3 = new bfjw
            r3.<init>(r2, r1)
            return r3
        L_0x010e:
            r19 = r15
        L_0x0110:
            int r15 = r19 + 1
            r14 = 0
            goto L_0x0046
        L_0x0115:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bfjx.m97068b(java.util.Calendar):bfjw");
    }

    /* renamed from: a */
    public final long mo61806a(Calendar calendar) {
        return mo61808b(calendar, false);
    }

    public bfjx(List list, bgmk bgmk, bfjf bfjf) {
        this.f114239a = list;
        this.f114240b = bgmk;
        this.f114241c = bfjf;
    }

    /* renamed from: a */
    public final bfjv mo61807a(Calendar calendar, boolean z) {
        bfjw bfjw;
        bfju bfju;
        boolean z2;
        bfla bfla = null;
        if (z) {
            bfju = bfju.FORCED_COLLECTION_FOR_TESTING;
            bfjw = null;
            z2 = true;
        } else {
            bfjw = m97068b(calendar);
            if (bfjw != null) {
                boolean b = bfjw.f114237a.mo61869b(calendar);
                if (b) {
                    z2 = b;
                    bfju = bfjw.f114238b;
                } else {
                    z2 = b;
                    bfju = null;
                }
            } else {
                bfju = null;
                z2 = false;
            }
        }
        if (bfjw != null) {
            bfla = bfjw.f114237a;
        }
        return new bfjv(z2, bfju, bfla);
    }

    /* renamed from: b */
    public final long mo61808b(Calendar calendar, boolean z) {
        boolean z2;
        bfjw b = m97068b(calendar);
        if (b == null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(5, 1);
            bfla.m97164a(calendar2, 0);
            b = m97068b(calendar2);
            z2 = true;
        } else {
            z2 = false;
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        if (z2) {
            calendar3.add(5, 1);
        }
        bmxy.m108581a(b);
        bmxy.m108581a(b.f114237a);
        bfla.m97164a(calendar3, z ? b.f114237a.f114327a : b.f114237a.f114328b);
        return calendar3.getTimeInMillis() - this.f114240b.mo62777d();
    }
}
