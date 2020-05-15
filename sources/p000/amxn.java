package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: amxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxn extends amxs {

    /* renamed from: a */
    private final amyt f76299a;

    /* renamed from: b */
    private final amyq f76300b;

    /* renamed from: c */
    private final amwl f76301c;

    /* renamed from: d */
    private final sqv f76302d;

    /* renamed from: e */
    private final amvt f76303e;

    /* renamed from: f */
    private final amwu f76304f;

    /* renamed from: g */
    private final amyr f76305g;

    /* renamed from: m */
    private final amyp f76306m;

    /* renamed from: n */
    private final amxo f76307n;

    /* renamed from: o */
    private final amxv f76308o;

    /* renamed from: p */
    private final amxm f76309p;

    /* renamed from: q */
    private final bmxv f76310q;

    /* renamed from: r */
    private final bmxv f76311r;

    static {
        String valueOf = String.valueOf(amxn.class.getSimpleName());
        if (valueOf.length() == 0) {
            new String("FSA2_");
        } else {
            "FSA2_".concat(valueOf);
        }
    }

    public amxn(amwu amwu, amwr amwr, amwl amwl, ContentResolver contentResolver, amyt amyt, Account account, anaz anaz, amvm amvm, sqv sqv, anav anav, bmxv bmxv, bmxv bmxv2) {
        super(contentResolver, account, anaz, anav, amvm);
        this.f76301c = amwl;
        this.f76299a = amyt;
        this.f76300b = new amyq(contentResolver, account, amvm, anaz, amwl);
        this.f76302d = sqv;
        this.f76303e = new amvt(account, contentResolver, anaz);
        this.f76304f = amwu;
        this.f76305g = new amyr(anaz, this.f76303e);
        this.f76306m = new amyp(this.f76303e, this.f76300b, account, contentResolver, amwl);
        amyf amyf = new amyf();
        amyk amyk = new amyk(account, contentResolver);
        this.f76307n = new amxo(anaz, this.f76300b, this.f76305g, this.f76306m, amvm, this.f76303e, amwr, amyf, amyk, bmxv2);
        this.f76308o = new amxv(anaz, this.f76300b, this.f76305g, this.f76306m, amvm, this.f76303e, amwr, amyf, amyk, bmxv2);
        this.f76309p = new amxm(anaz, this.f76300b, this.f76305g, this.f76306m, amvm, this.f76303e, amwr, amyf, amyk, bmxv2);
        this.f76310q = bmxv;
        this.f76311r = bmxv2;
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
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190 A[Catch:{ all -> 0x010a, RemoteException -> 0x0103, all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019b A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo41548a() {
        /*
            r12 = this;
            java.lang.String r0 = "FSA_groupSyncDown"
            anav r1 = r12.f76342l
            r1.mo41626a()
            p000.amig.m62939a()
            bmxv r1 = r12.f76310q
            boolean r1 = r1.mo66813a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0024
            amfj r1 = p000.amfz.f74876a
            java.lang.Object r1 = r1.mo41191a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            anag r11 = new anag     // Catch:{ all -> 0x01a2 }
            amwu r5 = r12.f76304f     // Catch:{ all -> 0x01a2 }
            amwl r6 = r12.f76301c     // Catch:{ all -> 0x01a2 }
            amyt r7 = r12.f76299a     // Catch:{ all -> 0x01a2 }
            amvm r8 = r12.f76341k     // Catch:{ all -> 0x01a2 }
            android.net.Uri r9 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ all -> 0x01a2 }
            anaz r10 = r12.f76340j     // Catch:{ all -> 0x01a2 }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01a2 }
            amfj r4 = p000.amfo.f74865a     // Catch:{ all -> 0x01a2 }
            java.lang.Object r4 = r4.mo41191a()     // Catch:{ all -> 0x01a2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x01a2 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x01a2 }
            anaq r5 = new anaq     // Catch:{ all -> 0x01a2 }
            r5.<init>(r4)     // Catch:{ all -> 0x01a2 }
            anak r6 = new anak     // Catch:{ all -> 0x01a2 }
            amvm r7 = r12.f76341k     // Catch:{ all -> 0x01a2 }
            r6.<init>(r11, r7, r5)     // Catch:{ all -> 0x01a2 }
            r6.mo41594a()     // Catch:{ all -> 0x01a2 }
            anaq r6 = new anaq     // Catch:{ all -> 0x01a2 }
            r6.<init>(r4)     // Catch:{ all -> 0x01a2 }
            amyq r4 = r12.f76300b     // Catch:{ all -> 0x01a2 }
            r4.mo41561a(r5, r6)     // Catch:{ all -> 0x01a2 }
            r4 = 0
        L_0x005d:
            amvm r5 = r12.f76341k     // Catch:{ all -> 0x019f }
            r5.mo41389a()     // Catch:{ all -> 0x019f }
            cfwa r5 = p000.cfwa.f185820a     // Catch:{ all -> 0x019f }
            cfwb r5 = r5.mo6606a()     // Catch:{ all -> 0x019f }
            boolean r5 = r5.mo82818g()     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x0081
        L_0x006e:
            long r7 = p000.cfwa.m143264c()     // Catch:{ all -> 0x019f }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x019f }
            anao r5 = r6.mo41604a(r7, r5)     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            amvm r5 = r12.f76341k     // Catch:{ all -> 0x019f }
            r5.mo41389a()     // Catch:{ all -> 0x019f }
            goto L_0x006e
        L_0x0081:
            anao r5 = r6.mo41603a()     // Catch:{ all -> 0x019f }
        L_0x0085:
            r6.mo41607b()     // Catch:{ all -> 0x019f }
            bngx r7 = r5.mo41596a()     // Catch:{ all -> 0x019f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x019f }
        L_0x0090:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x019f }
            if (r8 != 0) goto L_0x0157
            amvt r7 = r12.f76303e     // Catch:{ all -> 0x019f }
            r7.mo41451b()     // Catch:{ all -> 0x019f }
            java.lang.String r7 = r5.mo41597b()     // Catch:{ all -> 0x019f }
            boolean r5 = r5.mo41598c()     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x011c
            amwl r5 = r12.f76301c     // Catch:{ all -> 0x019f }
            r5.mo41491b(r7)     // Catch:{ all -> 0x019f }
            amyt r5 = r12.f76299a     // Catch:{ all -> 0x019f }
            android.net.Uri r6 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ all -> 0x019f }
            r5.mo41574a(r6)     // Catch:{ all -> 0x019f }
            amyq r5 = r12.f76300b     // Catch:{ all -> 0x019f }
            android.content.ContentResolver r6 = r5.f76380a     // Catch:{ all -> 0x019f }
            android.net.Uri r7 = r5.f76401f     // Catch:{ all -> 0x019f }
            java.lang.String[] r8 = p000.amyq.f76400e     // Catch:{ all -> 0x019f }
            java.lang.String[] r9 = p000.amvt.f76137a     // Catch:{ all -> 0x019f }
            java.lang.String r9 = "title = 'Starred in Android'"
            r10 = 0
            r11 = 0
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x019f }
            if (r6 == 0) goto L_0x010f
        L_0x00c5:
            boolean r7 = r6.moveToNext()     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x00d2
            boolean r7 = r6.isNull(r3)     // Catch:{ all -> 0x010a }
            if (r7 != 0) goto L_0x00c5
            goto L_0x00d3
        L_0x00d2:
            r2 = 0
        L_0x00d3:
            r6.close()     // Catch:{ all -> 0x019f }
            if (r2 == 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            java.lang.String r2 = "No synced Starred in Android groups."
            r5.mo41569a(r2)     // Catch:{ all -> 0x019f }
        L_0x00de:
            android.content.ContentResolver r2 = r5.f76380a     // Catch:{ all -> 0x019f }
            android.net.Uri r3 = r5.f76401f     // Catch:{ all -> 0x019f }
            java.lang.String r6 = "system_id = 'Contacts' AND sourceid IS NOT NULL"
            r7 = 0
            int r2 = p000.amvt.m63469a(r2, r3, r6, r7)     // Catch:{ RemoteException -> 0x0103 }
            if (r2 > 0) goto L_0x00f0
            java.lang.String r2 = "No synced My Contacts groups."
            r5.mo41569a(r2)     // Catch:{ all -> 0x019f }
        L_0x00f0:
            if (r1 == 0) goto L_0x00fd
            bmxv r1 = r12.f76310q
            java.lang.Object r1 = r1.mo66814b()
            amxe r1 = (p000.amxe) r1
            r1.mo41525g()
        L_0x00fd:
            anav r1 = r12.f76342l
            r1.mo41627a(r0, r4)
            return
        L_0x0103:
            r2 = move-exception
            amyc r3 = new amyc     // Catch:{ all -> 0x019f }
            r3.<init>(r2)     // Catch:{ all -> 0x019f }
            throw r3     // Catch:{ all -> 0x019f }
        L_0x010a:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x019f }
            throw r2     // Catch:{ all -> 0x019f }
        L_0x010f:
            amyc r2 = new amyc     // Catch:{ all -> 0x019f }
            android.os.RemoteException r3 = new android.os.RemoteException     // Catch:{ all -> 0x019f }
            java.lang.String r5 = "Unable to query local Starred in Android Groups."
            r3.<init>(r5)     // Catch:{ all -> 0x019f }
            r2.<init>(r3)     // Catch:{ all -> 0x019f }
            throw r2     // Catch:{ all -> 0x019f }
        L_0x011c:
            amwl r5 = r12.f76301c     // Catch:{ all -> 0x019f }
            p000.sdo.m34959a(r7)     // Catch:{ all -> 0x019f }
            amwm r8 = r5.f76191a     // Catch:{ all -> 0x019f }
            amvh r8 = r8.mo41492a()     // Catch:{ all -> 0x019f }
            r9 = 5
            java.lang.Object r9 = r8.mo74142c(r9)     // Catch:{ all -> 0x019f }
            bxvd r9 = (p000.bxvd) r9     // Catch:{ all -> 0x019f }
            r9.mo73625a(r8)     // Catch:{ all -> 0x019f }
            boolean r8 = r9.f164950c     // Catch:{ all -> 0x019f }
            if (r8 != 0) goto L_0x0136
            goto L_0x013b
        L_0x0136:
            r9.mo74035c()     // Catch:{ all -> 0x019f }
            r9.f164950c = r3     // Catch:{ all -> 0x019f }
        L_0x013b:
            bxvk r8 = r9.f164949b     // Catch:{ all -> 0x019f }
            amvh r8 = (p000.amvh) r8     // Catch:{ all -> 0x019f }
            amvh r10 = p000.amvh.f76004g     // Catch:{ all -> 0x019f }
            r7.getClass()     // Catch:{ all -> 0x019f }
            int r10 = r8.f76006a     // Catch:{ all -> 0x019f }
            r10 = r10 | 8
            r8.f76006a = r10     // Catch:{ all -> 0x019f }
            r8.f76010e = r7     // Catch:{ all -> 0x019f }
            bxvk r7 = r9.mo74062i()     // Catch:{ all -> 0x019f }
            amvh r7 = (p000.amvh) r7     // Catch:{ all -> 0x019f }
            r5.mo41488a(r7)     // Catch:{ all -> 0x019f }
            goto L_0x005d
        L_0x0157:
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x019f }
            anad r8 = (p000.anad) r8     // Catch:{ all -> 0x019f }
            java.lang.Object r9 = r8.f76463a     // Catch:{ all -> 0x019f }
            amvr r9 = (p000.amvr) r9     // Catch:{ all -> 0x019f }
            java.lang.Object r10 = r8.f76464b     // Catch:{ all -> 0x019f }
            amvr r10 = (p000.amvr) r10     // Catch:{ all -> 0x019f }
            if (r10 == 0) goto L_0x0177
            java.lang.String r10 = r10.mo41407m()     // Catch:{ all -> 0x019f }
            java.lang.String r11 = r9.mo41407m()     // Catch:{ all -> 0x019f }
            boolean r10 = android.text.TextUtils.equals(r10, r11)     // Catch:{ all -> 0x019f }
            if (r10 == 0) goto L_0x0177
            r10 = 1
            goto L_0x0178
        L_0x0177:
            r10 = 0
        L_0x0178:
            r9.mo41405k()     // Catch:{ all -> 0x019f }
            java.lang.String r9 = r9.mo41405k()     // Catch:{ all -> 0x019f }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x019f }
            if (r9 != 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            if (r10 == 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            amyr r9 = r12.f76305g     // Catch:{ all -> 0x019f }
            r9.mo41570a(r8, r2)     // Catch:{ all -> 0x019f }
        L_0x018e:
            if (r1 == 0) goto L_0x019b
            bmxv r8 = r12.f76310q     // Catch:{ all -> 0x019f }
            java.lang.Object r8 = r8.mo66814b()     // Catch:{ all -> 0x019f }
            amxe r8 = (p000.amxe) r8     // Catch:{ all -> 0x019f }
            r8.mo41524e(r2)     // Catch:{ all -> 0x019f }
        L_0x019b:
            int r4 = r4 + 1
            goto L_0x0090
        L_0x019f:
            r2 = move-exception
            r3 = r4
            goto L_0x01a3
        L_0x01a2:
            r2 = move-exception
        L_0x01a3:
            if (r1 == 0) goto L_0x01b0
            bmxv r1 = r12.f76310q
            java.lang.Object r1 = r1.mo66814b()
            amxe r1 = (p000.amxe) r1
            r1.mo41525g()
        L_0x01b0:
            anav r1 = r12.f76342l
            r1.mo41627a(r0, r3)
            goto L_0x01b7
        L_0x01b6:
            throw r2
        L_0x01b7:
            goto L_0x01b6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.amxn.mo41548a():void");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [amyi, java.util.ArrayList]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c  */
    /* renamed from: b */
    public final void mo41550b() {
        boolean z;
        amvy a;
        this.f76342l.mo41626a();
        amig.m62939a();
        int i = 0;
        if (!this.f76311r.mo66813a() || !((Boolean) amgc.f74879a.mo41191a()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            amyq amyq = this.f76300b;
            ContentResolver contentResolver = amyq.f76380a;
            Uri uri = amyq.f76401f;
            String[] strArr = amvt.f76137a;
            a = amvy.m63503a(contentResolver, uri, null, "data_set IS NULL AND (sourceid IS NULL OR dirty != 0 OR deleted != 0)", null, null);
            EnumMap enumMap = new EnumMap(amyi.class);
            enumMap.put((Object) amyi.INSERTED, (Object) new ArrayList());
            enumMap.put((Object) amyi.DELETED, (Object) new ArrayList());
            enumMap.put((Object) amyi.UPDATED, (Object) new ArrayList());
            amig.m62939a();
            int intValue = ((Integer) amhw.f74925a.mo41191a()).intValue();
            int i2 = 0;
            while (true) {
                amvr a2 = a.mo41464b();
                if (a2 != null) {
                    if (i2 >= intValue) {
                        break;
                    }
                    amyq.f76382c.mo41389a();
                    if (a2.mo41399f()) {
                        if (a2.mo41404j() != null) {
                            ((List) enumMap.get(amyi.DELETED)).add(a2);
                            i2++;
                        }
                    } else if (a2.mo41404j() == null) {
                        ((List) enumMap.get(amyi.INSERTED)).add(a2);
                        i2++;
                    } else if (a2.mo41397e()) {
                        ((List) enumMap.get(amyi.UPDATED)).add(a2);
                        i2++;
                    }
                } else {
                    break;
                }
            }
            amyq.mo41560a(amyq.f76401f, "data_set IS NULL");
            ((List) enumMap.get(amyi.DELETED)).size();
            a.mo41472f();
            List list = (List) enumMap.get(amyi.INSERTED);
            List list2 = (List) enumMap.get(amyi.DELETED);
            List list3 = (List) enumMap.get(amyi.UPDATED);
            i = list3.size() + list.size() + list2.size();
            if (z) {
                try {
                    int size = list.size() + list3.size();
                    if (((Boolean) amgf.f74882a.mo41191a()).booleanValue()) {
                        size += list2.size();
                    }
                    ((amxh) this.f76311r.mo66814b()).mo41518b(size);
                } catch (Throwable th) {
                    th = th;
                    if (z) {
                        ((amxh) this.f76311r.mo66814b()).mo41525g();
                    }
                    this.f76342l.mo41627a("FSA_groupSyncUp", i);
                    throw th;
                }
            }
            this.f76307n.mo41539a(list);
            this.f76308o.mo41539a(list3);
            this.f76309p.mo41539a(list2);
            if (z) {
                ((amxh) this.f76311r.mo66814b()).mo41525g();
            }
            this.f76342l.mo41627a("FSA_groupSyncUp", i);
        } catch (Throwable th2) {
            th = th2;
            if (z) {
            }
            this.f76342l.mo41627a("FSA_groupSyncUp", i);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo41549a(amkb amkb) {
        try {
            amyq amyq = this.f76300b;
            this.f76340j.mo41631a(amjf.GROUP, amkb, amjd.CP2, amyq.mo41560a(amvt.m63471a(ContactsContract.Groups.CONTENT_URI, amyq.f76381b), "data_set IS NULL AND deleted = 0"));
        } catch (amyc e) {
            this.f76340j.mo41631a(amjf.GROUP, amkb, amjd.CP2, -1);
        }
    }
}
