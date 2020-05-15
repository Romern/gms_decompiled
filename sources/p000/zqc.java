package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: zqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zqc extends acm implements View.OnClickListener {

    /* renamed from: s */
    final TextView f55685s;

    /* renamed from: t */
    zqe f55686t;

    /* renamed from: u */
    final /* synthetic */ zqg f55687u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zqc(zqg zqg, View view) {
        super(view);
        this.f55687u = zqg;
        this.f55685s = (TextView) view.findViewById(C0126R.C0129id.fitness_manage_data_sources_type_name);
        view.findViewById(C0126R.C0129id.fitness_manage_data_sources_type_delete_button).setOnClickListener(this);
    }

    public void onClick(View view) {
        this.f55687u.mo31322a().mo19188a(this.f55686t.f55690a);
    }
}
