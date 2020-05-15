package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.Date;

/* renamed from: fpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fpg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fpk f17077a;

    public fpg(fpk fpk) {
        this.f17077a = fpk;
    }

    public void onClick(View view) {
        if (!this.f17077a.mo11104a(this.f17077a.mo11102a(), this.f17077a.mo11105b())) {
            fpk fpk = this.f17077a;
            Date a = fpk.mo11102a();
            Date b = fpk.mo11105b();
            StringBuilder sb = new StringBuilder();
            sb.append("GMS Core Radio Activity:\n");
            if (cdna.m134126g()) {
                fpk.mo11103a(0, a, b, sb);
            }
            if (cdna.m134127h()) {
                fpk.mo11103a(1, a, b, sb);
            }
            fpk.f17084b = sb.toString();
            fpk fpk2 = this.f17077a;
            fpk2.f17085c.setText(fpk2.f17084b);
            ((LinearLayout) this.f17077a.f17086d.findViewById(C0126R.C0129id.file_content_text_view_heading_linear_layout)).setVisibility(0);
            ((LinearLayout) this.f17077a.f17086d.findViewById(C0126R.C0129id.dump_linear_layout)).setVisibility(0);
        }
    }
}
