package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: anow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anow extends aonm {

    /* renamed from: a */
    final /* synthetic */ anpb f77332a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public anow(anpb anpb, rtp rtp) {
        super(r5);
        this.f77332a = anpb;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rtp.mo24660a(); i++) {
            alzj b = ((amev) rtp).mo24661a(i);
            if (b.mo41058f() != 1) {
                arrayList.add(b);
            }
        }
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        return this.f77332a.f77361f;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo11413a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        return this.f77332a.mo42063b((alzj) obj, view, viewGroup, z);
    }
}
