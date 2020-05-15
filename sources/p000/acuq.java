package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: acuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acuq extends acup {

    /* renamed from: a */
    final /* synthetic */ Activity f60825a;

    /* renamed from: b */
    final /* synthetic */ acur f60826b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acuq(acur acur, String str, Activity activity) {
        super(str);
        this.f60826b = acur;
        this.f60825a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo33110a() {
        return this.f60825a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo33111b() {
        return this.f60826b.f60827a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo33112c() {
        return this.f60826b.f60828b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final TextView mo33113d() {
        return (TextView) this.f60826b.f60829c.findViewById(C0126R.C0129id.indexable_text);
    }
}
