package p000;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

/* renamed from: ailj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ailj implements Closeable {

    /* renamed from: a */
    public final String f69126a;

    /* renamed from: b */
    public final Set f69127b = new C1225nr();

    public ailj(String str) {
        this.f69126a = str;
    }

    /* renamed from: a */
    public abstract InputStream mo37636a();

    /* renamed from: a */
    public final void mo37637a(aili aili) {
        this.f69127b.add(aili);
    }

    /* renamed from: b */
    public abstract OutputStream mo37638b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo37639c();

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:313)
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:83)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public final void close() {
        /*
            r3 = this;
            r3.mo37639c()     // Catch:{ all -> 0x001a }
            java.util.Set r0 = r3.f69127b
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            aili r1 = (p000.aili) r1
            r1.mo37561a()
            goto L_0x0009
        L_0x0019:
            return
        L_0x001a:
            r0 = move-exception
            java.util.Set r1 = r3.f69127b
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()
            aili r2 = (p000.aili) r2
            r2.mo37561a()
            goto L_0x0021
        L_0x0031:
            goto L_0x0033
        L_0x0032:
            throw r0
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ailj.close():void");
    }

    public final String toString() {
        return this.f69126a;
    }
}
