package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/* renamed from: biyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyp implements View.OnClickListener {

    /* renamed from: a */
    public final int f122331a;

    /* renamed from: b */
    public CharSequence f122332b;

    /* renamed from: c */
    public boolean f122333c = true;

    /* renamed from: d */
    public int f122334d = 0;

    /* renamed from: e */
    public int f122335e;

    /* renamed from: f */
    public View.OnClickListener f122336f;

    /* renamed from: g */
    public biym f122337g;

    /* renamed from: h */
    private int f122338h = 0;

    public biyp(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bixm.f122205b);
        this.f122332b = obtainStyledAttributes.getString(1);
        this.f122336f = null;
        int i = obtainStyledAttributes.getInt(2, 0);
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Not a ButtonType");
        }
        this.f122331a = i;
        this.f122335e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final PersistableBundle mo64884a(String str) {
        String str2;
        PersistableBundle persistableBundle = new PersistableBundle();
        String concat = str.concat("_text");
        String charSequence = this.f122332b.toString();
        if (charSequence.length() > 50) {
            charSequence = String.format("%s…", charSequence.substring(0, 49));
        }
        persistableBundle.putString(concat, charSequence);
        String concat2 = str.concat("_type");
        switch (this.f122331a) {
            case 1:
                str2 = "ADD_ANOTHER";
                break;
            case 2:
                str2 = "CANCEL";
                break;
            case 3:
                str2 = "CLEAR";
                break;
            case 4:
                str2 = "DONE";
                break;
            case 5:
                str2 = "NEXT";
                break;
            case 6:
                str2 = "OPT_IN";
                break;
            case 7:
                str2 = "SKIP";
                break;
            case 8:
                str2 = "STOP";
                break;
            default:
                str2 = "OTHER";
                break;
        }
        persistableBundle.putString(concat2, str2);
        persistableBundle.putInt(str.concat("_onClickCount"), this.f122338h);
        return persistableBundle;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f122336f;
        if (onClickListener != null) {
            this.f122338h++;
            onClickListener.onClick(view);
        }
    }

    public biyp(CharSequence charSequence, View.OnClickListener onClickListener, int i, int i2) {
        this.f122332b = charSequence;
        this.f122336f = onClickListener;
        this.f122331a = i;
        this.f122335e = i2;
    }

    /* renamed from: a */
    public final void mo64885a(int i) {
        LinearLayout linearLayout;
        Button button;
        this.f122334d = i;
        biym biym = this.f122337g;
        if (biym != null && (linearLayout = biym.f122308b.f122313e) != null && (button = (Button) linearLayout.findViewById(biym.f122307a)) != null) {
            button.setVisibility(i);
            biym.f122308b.mo64879d();
        }
    }

    /* renamed from: a */
    public final void mo64886a(Context context, int i) {
        mo64887a(context.getText(i));
    }

    /* renamed from: a */
    public final void mo64887a(CharSequence charSequence) {
        LinearLayout linearLayout;
        Button button;
        this.f122332b = charSequence;
        biym biym = this.f122337g;
        if (biym != null && (linearLayout = biym.f122308b.f122313e) != null && (button = (Button) linearLayout.findViewById(biym.f122307a)) != null) {
            button.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo64888a(boolean z) {
        LinearLayout linearLayout;
        Button button;
        biyj biyj;
        this.f122333c = z;
        biym biym = this.f122337g;
        if (biym != null && (linearLayout = biym.f122308b.f122313e) != null && (button = (Button) linearLayout.findViewById(biym.f122307a)) != null) {
            button.setEnabled(z);
            biyn biyn = biym.f122308b;
            if (biyn.f122312d) {
                if (biym.f122307a == biyn.f122316h) {
                    biyj = biyj.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
                } else {
                    biyj = biyj.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
                }
                biyn.mo64876a(button, biyj);
            }
        }
    }
}
