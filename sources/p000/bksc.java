package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bksc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksc {

    /* renamed from: a */
    public final boolean f125195a;

    /* renamed from: b */
    private final List f125196b;

    /* renamed from: c */
    private final Deque f125197c;

    public bksc(boolean z) {
        LinkedList linkedList = new LinkedList();
        this.f125197c = linkedList;
        linkedList.push(Collections.emptyList());
        this.f125195a = z;
        this.f125196b = z ? new ArrayList() : null;
    }

    /* renamed from: a */
    public final List mo66308a() {
        return this.f125195a ? Collections.unmodifiableList(this.f125196b) : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection mo66311b() {
        if (!this.f125195a || this.f125196b.isEmpty()) {
            return Collections.emptyList();
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        List list = this.f125196b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bkrn bkrn = (bkrn) list.get(i);
            bkro bkro = (bkro) identityHashMap.get(bkrn.f125156a);
            if (bkro == null) {
                bkqo bkqo = bkrn.f125156a;
                bkro = new bkro(bkqo, bkrn.f125157b, bkrn.f125158c, bkqo.mo66251h());
                identityHashMap.put(bkrn.f125156a, bkro);
            }
            bkro.f125159d.add(bkrn);
        }
        return Collections.unmodifiableCollection(identityHashMap.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo66312c() {
        this.f125197c.pop();
    }

    /* renamed from: d */
    public final List mo66313d() {
        return (List) this.f125197c.peek();
    }

    /* renamed from: a */
    public final void mo66309a(bkrn bkrn) {
        this.f125196b.add(bkrn);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66310a(String str) {
        List list = (List) this.f125197c.peek();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(str);
        this.f125197c.push(Collections.unmodifiableList(arrayList));
    }
}
