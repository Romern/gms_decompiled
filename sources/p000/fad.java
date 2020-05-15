package p000;

import android.view.View;
import android.widget.Button;

/* renamed from: fad */
final /* synthetic */ class fad implements View.OnClickListener {

    /* renamed from: a */
    private final fak f16142a;

    /* renamed from: b */
    private final Button f16143b;

    public fad(fak fak, Button button) {
        this.f16142a = fak;
        this.f16143b = button;
    }

    public void onClick(View view) {
        fak fak = this.f16142a;
        this.f16143b.setOnClickListener(null);
        feq feq = fak.f16153a;
        feq.f16412d.mo10742a(fak.f16160h, 1, feq.f16413e, 0, 9);
        fdn fdn = feq.f16409a;
        fcg fcg = fdn.f16323a;
        fcg.f16263a.mo10449a(Long.valueOf(fdn.f16325c.f147492b));
        int b = fak.mo10635b(fak.f16158f.f1754c);
        fai fai = fak.f16155c;
        bsus bsus = ((bswu) fak.f16154b.f147493c.get(b)).f147501d;
        if (bsus == null) {
            bsus = bsus.f147182c;
        }
        fai.mo10633a(bsus, new fag(fak));
    }
}
