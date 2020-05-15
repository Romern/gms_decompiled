package p000;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;

/* renamed from: amre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amre {
    /* renamed from: a */
    static final void m63199a(Context context, rjy rjy) {
        rjy.mo24779a(wvu.f51440b);
        alue.m61884b();
        bnre i = alue.m61883a(context).listIterator();
        while (i.hasNext()) {
            bnre i2 = ((alud) i.next()).mo40789a().listIterator();
            while (i2.hasNext()) {
                ((alub) i2.next()).mo40785b();
            }
        }
    }

    /* renamed from: a */
    static final void m63200a(ViewGroup viewGroup, rkb rkb) {
        alue.m61884b();
        bnre i = alue.m61883a(viewGroup.getContext()).listIterator();
        while (i.hasNext()) {
            alud alud = (alud) i.next();
            Context context = viewGroup.getContext();
            Button button = new Button(context);
            button.setVisibility(8);
            button.setText(alud.f74292a);
            Boolean bool = alud.f74295d;
            if (bool != null ? bool.booleanValue() : soz.m35800c(context)) {
                button.setOnClickListener(new amrc(rkb, alud));
                button.setVisibility(0);
            }
            viewGroup.addView(button);
        }
    }
}
