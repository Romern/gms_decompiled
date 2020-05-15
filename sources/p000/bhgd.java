package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: bhgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgd extends C1326rk {

    /* renamed from: f */
    final /* synthetic */ Chip f118533f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhgd(Chip chip, Chip chip2) {
        super(chip2);
        this.f118533f = chip;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo15805a(float f, float f2) {
        Chip chip = this.f118533f;
        Rect rect = Chip.f151136a;
        return (!chip.mo71077c() || !this.f118533f.mo71078d().contains(f, f2)) ? 0 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15808a(int i, C1301qm qmVar) {
        CharSequence charSequence = "";
        if (i == 1) {
            CharSequence text = this.f118533f.getText();
            Context context = this.f118533f.getContext();
            Object[] objArr = new Object[1];
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            objArr[0] = charSequence;
            qmVar.mo15766c(context.getString(C0126R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            Chip chip = this.f118533f;
            Rect rect = Chip.f151136a;
            qmVar.mo15759b(chip.mo71081e());
            qmVar.mo15757a(C1298qj.f26862c);
            qmVar.mo15780g(this.f118533f.isEnabled());
            return;
        }
        qmVar.mo15766c(charSequence);
        qmVar.mo15759b(Chip.f151136a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15809a(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f118533f;
            Rect rect = Chip.f151136a;
            chip.f151143e = z;
            chip.refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15810a(List list) {
        Chip chip;
        bhgf bhgf;
        list.add(0);
        Chip chip2 = this.f118533f;
        Rect rect = Chip.f151136a;
        if (chip2.mo71077c() && (bhgf = (chip = this.f118533f).f151140b) != null && bhgf.f118579d) {
            View.OnClickListener onClickListener = chip.f151141c;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15811a(C1301qm qmVar) {
        String str;
        qmVar.mo15758a(this.f118533f.mo71082f());
        qmVar.mo15777f(this.f118533f.isClickable());
        if (this.f118533f.mo71082f() || this.f118533f.isClickable()) {
            if (!this.f118533f.mo71082f()) {
                str = "android.widget.Button";
            } else {
                str = "android.widget.CompoundButton";
            }
            qmVar.mo15755a((CharSequence) str);
        } else {
            qmVar.mo15755a((CharSequence) "android.view.View");
        }
        CharSequence text = this.f118533f.getText();
        int i = Build.VERSION.SDK_INT;
        qmVar.mo15760b(text);
    }

    /* renamed from: a */
    public final boolean mo15812a(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.f118533f.performClick();
            }
            if (i == 1) {
                this.f118533f.mo71083g();
            }
        }
        return false;
    }
}
