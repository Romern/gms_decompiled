package p000;

import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqg {

    /* renamed from: a */
    public int f24794a = 0;

    /* renamed from: b */
    public int f24795b = 0;

    /* renamed from: c */
    public int f24796c = -1;

    /* renamed from: d */
    public int f24797d = -1;

    /* renamed from: e */
    public String f24798e = "";

    /* renamed from: f */
    private final bngs f24799f = bngx.m109377j();

    /* renamed from: g */
    private AutofillId f24800g = null;

    /* renamed from: h */
    private lbc f24801h = lbc.UNKNOWN_DETECTION_METHOD;

    /* renamed from: i */
    private bnia f24802i = bnic.m109500j();

    /* renamed from: j */
    private bngs f24803j = bngx.m109377j();

    /* renamed from: a */
    public final FillField mo14800a() {
        AutofillId autofillId = this.f24800g;
        if (autofillId != null) {
            bnic a = this.f24802i.mo67751a();
            if (!a.isEmpty()) {
                return new FillField(autofillId, this.f24794a, this.f24799f.mo67664a(), a, this.f24795b, this.f24801h, this.f24803j.mo67664a(), this.f24796c, this.f24797d, this.f24798e);
            }
            throw new IllegalStateException("Field types can not be empty. See addFieldType() and #addFieldTypes().");
        }
        throw new IllegalStateException("setAutofillId() is required to be called.");
    }

    /* renamed from: b */
    public final void mo14807b(Iterable iterable) {
        bngs j = bngx.m109377j();
        this.f24803j = j;
        j.mo67666b(iterable);
    }

    /* renamed from: b */
    public final void mo14808b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mo14804a((kpb) it.next());
        }
    }

    /* renamed from: a */
    public final void mo14801a(AutofillId autofillId) {
        bmxy.m108581a(autofillId);
        this.f24800g = autofillId;
    }

    /* renamed from: a */
    public final void mo14802a(Iterable iterable) {
        this.f24802i = bnic.m109500j();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo14804a((kpb) it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo14803a(Collection r5) {
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            CharSequence charSequence = (CharSequence) r5.get(i);
            this.f24799f.mo67668c(charSequence == null ? "" : charSequence.toString());
        }
    }

    /* renamed from: a */
    public final void mo14804a(kpb kpb) {
        bnia bnia = this.f24802i;
        bmxy.m108581a(kpb);
        bnia.mo67629b(kpb);
    }

    /* renamed from: a */
    public final void mo14805a(lbc lbc) {
        bmxy.m108581a(lbc);
        this.f24801h = lbc;
    }

    /* renamed from: a */
    public final void mo14806a(CharSequence... charSequenceArr) {
        int length = charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            CharSequence charSequence = charSequenceArr[i];
            this.f24799f.mo67668c(charSequence == null ? "" : charSequence.toString());
        }
    }
}
