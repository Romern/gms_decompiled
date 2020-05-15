package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ale */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ale implements aku {

    /* renamed from: a */
    final /* synthetic */ alf f820a;

    public ale(alf alf) {
        this.f820a = alf;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo928a(akv akv, Collection r10) {
        alf alf = this.f820a;
        int indexOfValue = alf.f824d.indexOfValue(akv);
        if (indexOfValue < 0) {
            "Ignoring unknown dynamic group route controller: " + akv;
            return;
        }
        int keyAt = alf.f824d.keyAt(indexOfValue);
        ArrayList arrayList = new ArrayList();
        int size = r10.size();
        for (int i = 0; i < size; i++) {
            akt akt = (akt) r10.get(i);
            if (akt.f795f == null) {
                akt.f795f = new Bundle();
                akt.f795f.putBundle("mrDescriptor", akt.f790a.f779a);
                akt.f795f.putInt("selectionState", akt.f791b);
                akt.f795f.putBoolean("isUnselectable", akt.f792c);
                akt.f795f.putBoolean("isGroupable", akt.f793d);
                akt.f795f.putBoolean("isTransferable", akt.f794e);
            }
            arrayList.add(akt.f795f);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("dynamicRoutes", arrayList);
        alj.m1008a(alf.f821a, 7, 0, keyAt, bundle, null);
    }
}
