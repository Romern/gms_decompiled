package p000;

import android.view.View;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: aqvm */
public final /* synthetic */ class aqvm implements View.OnLongClickListener {

    /* renamed from: a */
    private final HeaderView f86927a;

    /* renamed from: b */
    private final String f86928b;

    public aqvm(HeaderView headerView, String str) {
        this.f86927a = headerView;
        this.f86928b = str;
    }

    public final boolean onLongClick(View view) {
        HeaderView headerView = this.f86927a;
        tey.m36885a(headerView.getContext(), this.f86928b).show();
        return true;
    }
}
