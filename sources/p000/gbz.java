package p000;

import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: gbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbz implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final gdt f17864a;

    /* renamed from: b */
    public final HashSet f17865b = new HashSet();

    /* renamed from: c */
    public boolean f17866c = true;

    /* renamed from: d */
    final /* synthetic */ gca f17867d;

    public gbz(gca gca, gdt gdt) {
        this.f17867d = gca;
        sdo.m34959a(gdt);
        this.f17864a = gdt;
    }

    /* renamed from: a */
    public final void mo11628a(IBinder iBinder) {
        if (!this.f17865b.contains(iBinder)) {
            iBinder.linkToDeath(this, 0);
            this.f17865b.add(iBinder);
            if (this.f17865b.size() > 1) {
                srn srn = gdv.f17985a;
                this.f17867d.mo11632a();
            }
        }
    }

    public final synchronized void binderDied() {
        if (this.f17866c) {
            gca gca = this.f17867d;
            gca.mo11634a(this.f17864a);
            Iterator it = gca.f17869a.iterator();
            while (it.hasNext()) {
                ((gby) it.next()).mo11627a(this.f17864a);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("listener(asBinder)=");
        sb.append(this.f17864a.f17980d.asBinder());
        if (this.f17865b.isEmpty()) {
            sb.append("no binders");
        } else {
            sb.append(",binder=");
            Iterator it = this.f17865b.iterator();
            while (it.hasNext()) {
                sb.append((IBinder) it.next());
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
