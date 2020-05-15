package p000;

import java.util.ArrayList;

/* renamed from: bjjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjh {

    /* renamed from: a */
    public bjjh f122823a;

    /* renamed from: b */
    public ArrayList f122824b;

    /* renamed from: c */
    public bwxl f122825c;

    /* renamed from: d */
    public boolean f122826d = false;

    public bjjh(bwxl bwxl) {
        this.f122825c = bwxl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65295a() {
        ArrayList arrayList = this.f122824b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bjjh) arrayList.get(i)).f122823a = null;
            }
            this.f122824b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo65297b() {
        if (!this.f122826d) {
            this.f122826d = true;
            bjjh bjjh = this.f122823a;
            if (bjjh != null) {
                bjjh.mo65297b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65296a(bjjh bjjh) {
        if (this.f122824b == null) {
            this.f122824b = new ArrayList();
        }
        this.f122824b.add(bjjh);
        bjjh.f122823a = this;
    }
}
