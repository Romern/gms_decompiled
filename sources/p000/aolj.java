package p000;

import android.widget.Filter;

/* renamed from: aolj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aolj extends Filter {

    /* renamed from: a */
    final /* synthetic */ aoln f78399a;

    public aolj(aoln aoln) {
        this.f78399a = aoln;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int length;
        String str = null;
        if (charSequence != null && (length = charSequence.length()) > 0 && aolp.m65993a(charSequence.charAt(0))) {
            str = charSequence.subSequence(1, length).toString();
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = str;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        aoln aoln = this.f78399a;
        String str = (String) filterResults.values;
        if (aoln.f78407J != null && aoln.f78408K != null) {
            aoln.f78406I = str;
            aoln.f78409L.mo42154a(aoln.f78406I);
            aoln.f78407J.mo41661b(aoln.f78406I);
            aoln.f78408K.mo42155a(aoln.f78406I);
        }
    }
}
