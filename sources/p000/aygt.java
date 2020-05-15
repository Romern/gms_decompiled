package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: aygt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygt implements axxc {

    /* renamed from: a */
    final /* synthetic */ WearableChimeraService f97549a;

    public aygt(WearableChimeraService wearableChimeraService) {
        this.f97549a = wearableChimeraService;
    }

    /* renamed from: a */
    private final void m83977a(axzf axzf, int i, boolean z, boolean z2) {
        int i2 = 3;
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(axzf.f96814a);
            Log.d("WearableService", valueOf.length() == 0 ? new String("onPeerConnected: ") : "onPeerConnected: ".concat(valueOf));
        }
        aygr aygr = new aygr("onPeerConnected", new Intent("com.google.android.gms.wearable.NODE_CHANGED", ayao.m83709a(axzf.f96814a, null)), new NodeParcelable(axzf.f96814a, axzf.f96815b, i, z), axzf);
        synchronized (this.f97549a.f111026r) {
            WearableChimeraService wearableChimeraService = this.f97549a;
            if (!z2) {
                i2 = 4;
            }
            for (axue axue : wearableChimeraService.mo60324a(i2)) {
                WearableChimeraService wearableChimeraService2 = this.f97549a;
                wearableChimeraService2.mo60326a(axue, aygr, wearableChimeraService2.mo60327a(axue.f96377a));
            }
        }
    }

    /* renamed from: a */
    private final void m83978a(axzf axzf, boolean z) {
        int i = 3;
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(axzf.f96814a);
            Log.d("WearableService", valueOf.length() == 0 ? new String("onPeerDisconnected: ") : "onPeerDisconnected: ".concat(valueOf));
        }
        aygs aygs = new aygs("onPeerDisconnected", new Intent("com.google.android.gms.wearable.NODE_CHANGED", ayao.m83709a(axzf.f96814a, null)), new NodeParcelable(axzf.f96814a, axzf.f96815b, Integer.MAX_VALUE, false), axzf);
        synchronized (this.f97549a.f111026r) {
            WearableChimeraService wearableChimeraService = this.f97549a;
            if (!z) {
                i = 4;
            }
            for (axue axue : wearableChimeraService.mo60324a(i)) {
                WearableChimeraService wearableChimeraService2 = this.f97549a;
                wearableChimeraService2.mo60326a(axue, aygs, wearableChimeraService2.mo60327a(axue.f96377a));
            }
        }
    }

    /* renamed from: a */
    public final void mo53600a(axzf axzf) {
        if (!"cloud".equals(axzf.f96814a)) {
            m83978a(axzf, false);
        }
    }

    /* renamed from: a */
    public final void mo53601a(axzf axzf, int i, boolean z) {
        if (!"cloud".equals(axzf.f96814a)) {
            m83977a(axzf, i, z, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        r2 = new p000.aygq("onConnectedNodes", new android.content.Intent("com.google.android.gms.wearable.NODE_CHANGED", p000.ayao.f96960a), r0);
        r0 = r9.f97549a.f111026r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = r9.f97549a;
        r3 = p000.chnj.f188812a.mo6606a().mo85419ar();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        if (r1.f111027s.equals(r3) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dd, code lost:
        r1.f111027s = r3;
        r1.f111028t = new java.util.HashSet();
        java.util.Collections.addAll(r1.f111028t, android.text.TextUtils.split(r3, ","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f1, code lost:
        r1 = r9.f97549a.mo60324a(1).iterator();
        r4 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0102, code lost:
        if (r1.hasNext() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0104, code lost:
        r6 = (p000.axue) r1.next();
        r7 = r9.f97549a;
        r7.mo60326a(r6, r2, r7.mo60327a(r6.f96377a));
        r6 = r9.f97549a.mo60328b(r6.f96377a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011d, code lost:
        if (r6 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0121, code lost:
        if (r6.f97525c != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0123, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0125, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0126, code lost:
        if (r5 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0128, code lost:
        r0 = r9.f97549a.f111032z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012c, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r10 = r10.iterator();
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0137, code lost:
        if (r10.hasNext() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        r5 = (p000.ayac) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0143, code lost:
        if (r9.f97549a.f111023o != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0148, code lost:
        if (r5.f96889f != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0154, code lost:
        if ("cloud".equals(r5.f96884a.f96814a) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0160, code lost:
        if (r5.f96884a.equals(r9.f97549a.f111002B) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0164, code lost:
        if (r2 == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        if (r5.f96885b >= r2.f96885b) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016c, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        r10 = r9.f97549a;
        r5 = r10.f111002B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0173, code lost:
        if (r5 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0176, code lost:
        if (r4 != false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0178, code lost:
        r10.f111002B = null;
        m83978a(r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017d, code lost:
        r10 = r9.f97549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0181, code lost:
        if (r10.f111002B == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0184, code lost:
        if (r2 == null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
        r1 = r2.f96884a;
        r10.f111002B = r1;
        m83977a(r1, 1, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0192, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo53602a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet(new aygi());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ayac ayac = (ayac) it.next();
            if (!"cloud".equals(ayac.f96884a.f96814a)) {
                axzf axzf = ayac.f96884a;
                String str = axzf.f96814a;
                String str2 = axzf.f96815b;
                int i = ayac.f96885b;
                NodeParcelable nodeParcelable = new NodeParcelable(str, str2, i, axzm.m83604a(axzf, i));
                arrayList.add(nodeParcelable);
                treeSet.add(nodeParcelable);
            }
        }
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
            Log.d("WearableService", valueOf.length() == 0 ? new String("onConnectedNodes: ") : "onConnectedNodes: ".concat(valueOf));
        }
        synchronized (this.f97549a) {
            if (!treeSet.equals(this.f97549a.f111025q)) {
                this.f97549a.f111025q = treeSet;
            } else if (Log.isLoggable("WearableService", 3)) {
                String valueOf2 = String.valueOf(this.f97549a.f111025q);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 73);
                sb.append("onConnectedNodes: connected nodes hasn't changed, skipping notification. ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
        }
    }
}
