package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.mdns.MulticastNetworkInterfaceProvider$1;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* renamed from: agbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbv {

    /* renamed from: a */
    public static final agcm f65198a = new agcm("MdnsNIProvider");

    /* renamed from: f */
    private static final boolean f65199f = cczu.f180328a.mo6606a().mo77130k();

    /* renamed from: b */
    final Context f65200b;

    /* renamed from: c */
    final BroadcastReceiver f65201c;

    /* renamed from: d */
    public volatile boolean f65202d = true;

    /* renamed from: e */
    public boolean f65203e = false;

    /* renamed from: g */
    private final List f65204g = new ArrayList();

    public agbv(Context context) {
        this.f65200b = context;
        this.f65201c = new MulticastNetworkInterfaceProvider$1(this, "mdns");
    }

    /* renamed from: a */
    private final boolean m53899a(agbw agbw) {
        if (agbw != null) {
            try {
                if (!agbw.f65205a.isLoopback() && !agbw.f65205a.isPointToPoint() && !agbw.f65205a.isVirtual() && agbw.f65205a.isUp() && agbw.f65205a.supportsMulticast()) {
                    for (InterfaceAddress interfaceAddress : agbw.mo35212a()) {
                        if (interfaceAddress.getAddress() instanceof Inet4Address) {
                            return true;
                        }
                    }
                    for (InterfaceAddress interfaceAddress2 : agbw.mo35212a()) {
                        if (interfaceAddress2.getAddress() instanceof Inet6Address) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) f65198a.f65218b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("agbv", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to check interface %s.", agbw.f65205a.getDisplayName());
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo35211b() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    arrayList.add(new agbw(networkInterfaces.nextElement()));
                }
            }
        } catch (SocketException e) {
            bnsl bnsl = (bnsl) f65198a.f65218b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("agbv", "b", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get network interfaces.");
        }
        return arrayList;
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
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:210)
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
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r9.f65204g.add(r3);
     */
    /* renamed from: a */
    public final synchronized java.util.List mo35209a() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f65202d     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            r9.f65202d = r0     // Catch:{ all -> 0x00c8 }
            java.util.List r1 = r9.f65204g     // Catch:{ all -> 0x00c8 }
            r1.clear()     // Catch:{ all -> 0x00c8 }
            java.util.List r1 = r9.mo35211b()     // Catch:{ all -> 0x00c8 }
            int r2 = r1.size()     // Catch:{ all -> 0x00c8 }
        L_0x0015:
            if (r0 >= r2) goto L_0x00b0
            java.lang.Object r3 = r1.get(r0)     // Catch:{ all -> 0x00c8 }
            agbw r3 = (p000.agbw) r3     // Catch:{ all -> 0x00c8 }
            if (r3 != 0) goto L_0x0021
            goto L_0x00ac
        L_0x0021:
            java.net.NetworkInterface r4 = r3.f65205a     // Catch:{ IOException -> 0x0088 }
            boolean r4 = r4.isLoopback()     // Catch:{ IOException -> 0x0088 }
            if (r4 != 0) goto L_0x00ac
            java.net.NetworkInterface r4 = r3.f65205a     // Catch:{ IOException -> 0x0088 }
            boolean r4 = r4.isPointToPoint()     // Catch:{ IOException -> 0x0088 }
            if (r4 != 0) goto L_0x00ac
            java.net.NetworkInterface r4 = r3.f65205a     // Catch:{ IOException -> 0x0088 }
            boolean r4 = r4.isVirtual()     // Catch:{ IOException -> 0x0088 }
            if (r4 != 0) goto L_0x00ac
            java.net.NetworkInterface r4 = r3.f65205a     // Catch:{ IOException -> 0x0088 }
            boolean r4 = r4.isUp()     // Catch:{ IOException -> 0x0088 }
            if (r4 == 0) goto L_0x00ac
            java.net.NetworkInterface r4 = r3.f65205a     // Catch:{ IOException -> 0x0088 }
            boolean r4 = r4.supportsMulticast()     // Catch:{ IOException -> 0x0088 }
            if (r4 == 0) goto L_0x00ac
            java.util.List r4 = r3.mo35212a()     // Catch:{ IOException -> 0x0088 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0088 }
        L_0x0051:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x0088 }
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x0088 }
            java.net.InterfaceAddress r5 = (java.net.InterfaceAddress) r5     // Catch:{ IOException -> 0x0088 }
            java.net.InetAddress r5 = r5.getAddress()     // Catch:{ IOException -> 0x0088 }
            boolean r5 = r5 instanceof java.net.Inet4Address     // Catch:{ IOException -> 0x0088 }
            if (r5 == 0) goto L_0x0051
            goto L_0x0082
        L_0x0066:
            java.util.List r4 = r3.mo35212a()     // Catch:{ IOException -> 0x0088 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0088 }
        L_0x006e:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x0088 }
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x0088 }
            java.net.InterfaceAddress r5 = (java.net.InterfaceAddress) r5     // Catch:{ IOException -> 0x0088 }
            java.net.InetAddress r5 = r5.getAddress()     // Catch:{ IOException -> 0x0088 }
            boolean r5 = r5 instanceof java.net.Inet6Address     // Catch:{ IOException -> 0x0088 }
            if (r5 == 0) goto L_0x006e
        L_0x0082:
            java.util.List r4 = r9.f65204g     // Catch:{ all -> 0x00c8 }
            r4.add(r3)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ac
        L_0x0088:
            r4 = move-exception
            agcm r5 = p000.agbv.f65198a     // Catch:{ all -> 0x00c8 }
            srn r5 = r5.f65218b     // Catch:{ all -> 0x00c8 }
            bnsi r5 = r5.mo68387b()     // Catch:{ all -> 0x00c8 }
            bnsl r5 = (p000.bnsl) r5     // Catch:{ all -> 0x00c8 }
            r5.mo68437a(r4)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "agbv"
            java.lang.String r6 = "a"
            r7 = 156(0x9c, float:2.19E-43)
            java.lang.String r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)"
            r5.mo68432a(r4, r6, r7, r8)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "Failed to check interface %s."
            java.net.NetworkInterface r3 = r3.f65205a     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r3.getDisplayName()     // Catch:{ all -> 0x00c8 }
            r5.mo68420a(r4, r3)     // Catch:{ all -> 0x00c8 }
        L_0x00ac:
            int r0 = r0 + 1
            goto L_0x0015
        L_0x00b0:
            java.util.List r0 = r9.f65204g     // Catch:{ all -> 0x00c8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00bf
            agcm r0 = p000.agbv.f65198a     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "No network interface available for mDNS scanning."
            r0.mo35221a(r1)     // Catch:{ all -> 0x00c8 }
        L_0x00bf:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c8 }
            java.util.List r1 = r9.f65204g     // Catch:{ all -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r9)
            return r0
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x00cc
        L_0x00cb:
            throw r0
        L_0x00cc:
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.agbv.mo35209a():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r3 = r6;
     */
    /* renamed from: a */
    public final boolean mo35210a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        if (f65199f) {
            return true;
        }
        int size = list.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Iterator it = ((agbw) list.get(i)).mo35212a().iterator();
            while (true) {
                int i2 = i + 1;
                if (!it.hasNext()) {
                    break;
                } else if (!(((InterfaceAddress) it.next()).getAddress() instanceof Inet6Address)) {
                    return false;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }
}
