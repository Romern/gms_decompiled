package p000;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: aviu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aviu implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: a */
    private final View f93249a;

    /* renamed from: b */
    private final CompoundButton f93250b;

    /* renamed from: c */
    private final int f93251c;

    /* renamed from: d */
    private final avhx f93252d;

    public aviu(View view, CompoundButton compoundButton, int i, avhx avhx) {
        this.f93249a = view;
        this.f93250b = compoundButton;
        this.f93251c = i;
        this.f93252d = avhx;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f93249a.setVisibility(!z ? 8 : 0);
        this.f93252d.mo51247a(this.f93251c, z);
    }

    public void onClick(View view) {
        this.f93250b.toggle();
    }
}
