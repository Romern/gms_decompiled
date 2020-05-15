package p000;

import android.os.Bundle;
import java.util.List;

/* renamed from: axaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axaq implements axan, axao, bkea {

    /* renamed from: a */
    public axap f95547a;

    /* renamed from: b */
    public final bkgd f95548b;

    /* renamed from: c */
    public bwhx f95549c;

    public axaq(bkgd bkgd) {
        this.f95548b = bkgd;
    }

    /* renamed from: a */
    public final void mo52951a() {
        axap axap = (axap) this.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
        this.f95547a = axap;
        if (axap != null) {
            axap.f95542f = this.f95548b.f124186a;
            axap.f95543g = this;
        }
    }

    /* renamed from: b */
    public final boolean mo52806b(List list) {
        axap axap = (axap) this.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
        this.f95547a = axap;
        return axap == null || axap.mo52806b(list);
    }

    /* renamed from: bT */
    public final boolean mo52807bT() {
        axap axap = (axap) this.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
        this.f95547a = axap;
        return axap != null && axap.mo52807bT();
    }

    /* renamed from: c */
    public final bwhy mo52953c() {
        bwhx bwhx;
        axap axap = (axap) this.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
        this.f95547a = axap;
        if (axap != null) {
            bwhx = axap.mo52950f();
        } else {
            bwhx = this.f95549c;
        }
        if (bwhx == null) {
            return null;
        }
        bxvd da = bwhy.f159603b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwhy bwhy = (bwhy) da.f164949b;
        bwhx.getClass();
        if (!bwhy.f159605a.mo73666a()) {
            bwhy.f159605a = GeneratedMessageLite.m124021a(bwhy.f159605a);
        }
        bwhy.f159605a.add(bwhx);
        return (bwhy) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo52952a(bwhw bwhw) {
        axap axap = this.f95547a;
        if (axap != null) {
            axap.dismiss();
        }
        this.f95549c = null;
        bkgd bkgd = this.f95548b;
        axap axap2 = new axap();
        Bundle bundle = new Bundle();
        bjvp.m104736a(bundle, "filterCategoryProto", bwhw);
        bundle.putInt("themeResourceId", bkgd.f124188c);
        bundle.putString("analyticsSessionId", bkgd.f124191f);
        bundle.putParcelable("parentLogContext", bkgd.f124190e);
        axap2.setArguments(bundle);
        this.f95547a = axap2;
        bkgd bkgd2 = this.f95548b;
        axap2.f95542f = bkgd2.f124186a;
        axap2.f95543g = this;
        axap2.show(bkgd2.f124187b, "FilterCategoryDialogFragment");
    }

    /* renamed from: a */
    public final boolean mo52804a(List list) {
        axap axap = (axap) this.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
        this.f95547a = axap;
        return axap == null || axap.mo52804a(list);
    }
}
