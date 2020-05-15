package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: aauc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aauc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bzqi f56584a;

    /* renamed from: b */
    final /* synthetic */ Activity f56585b;

    /* renamed from: c */
    final /* synthetic */ aaug f56586c;

    public aauc(aaug aaug, bzqi bzqi, Activity activity) {
        this.f56586c = aaug;
        this.f56584a = bzqi;
        this.f56585b = activity;
    }

    public void onClick(View view) {
        String str = this.f56584a.f170996b;
        String charSequence = this.f56586c.getText().toString();
        aauf aauf = new aauf();
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("current_date", charSequence);
        aauf.setArguments(bundle);
        aauf.show(this.f56585b.getSupportFragmentManager(), "date_dialog");
    }
}
