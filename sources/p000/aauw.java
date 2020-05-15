package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aauw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauw {

    /* renamed from: a */
    public final View f56631a;

    /* renamed from: b */
    private final bzql f56632b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public aauw(bzql bzql, ViewGroup viewGroup, int i, View.OnClickListener onClickListener) {
        aauv aauv;
        int i2;
        this.f56632b = bzql;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        this.f56631a = inflate;
        if (onClickListener != null) {
            inflate.setOnClickListener(onClickListener);
            this.f56631a.setEnabled(!bzql.f171029e);
        }
        Context context = viewGroup.getContext();
        bzps a = bzps.m126020a(this.f56632b.f171026b);
        int ordinal = (a == null ? bzps.UNKNOWN_CONTACT_MODE : a).ordinal();
        if (ordinal != 1) {
            aauv = ordinal != 3 ? new aauv(C0126R.C0127drawable.quantum_ic_phone_white_24, C0126R.string.common_phone) : new aauv(C0126R.C0127drawable.quantum_ic_email_white_24, C0126R.string.common_email);
        } else {
            aauv = new aauv(C0126R.C0127drawable.quantum_ic_chat_white_24, C0126R.string.gh_menu_chat);
        }
        ImageView imageView = (ImageView) this.f56631a.findViewById(C0126R.C0129id.gh_contact_option_icon);
        Drawable a2 = C1133kh.m17836a(context, aauv.f56629a);
        boolean z = this.f56632b.f171029e;
        boolean z2 = !z;
        Drawable a3 = aayh.m47231a(a2, this.f56631a.getResources());
        if (!aayi.m47270b()) {
            if (!z) {
                i2 = C0126R.color.google_blue600;
            } else {
                i2 = C0126R.color.google_grey600;
            }
            aayh.m47245a(a3, context, i2);
        } else {
            aayh.m47244a(a3, !z2 ? aayi.m47263a(context, C0126R.attr.gh_disabledIconColor) : aayi.m47263a(context, C0126R.attr.gh_primaryBlueColor));
        }
        imageView.setImageDrawable(a3);
        m47054a((TextView) this.f56631a.findViewById(C0126R.C0129id.gh_contact_option_title), this.f56631a.getResources().getString(aauv.f56630b));
        mo31814a();
        viewGroup.addView(this.f56631a);
    }

    /* renamed from: a */
    public static void m47054a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* renamed from: b */
    public final TextView mo31815b() {
        return (TextView) this.f56631a.findViewById(C0126R.C0129id.gh_contact_wait_time_value);
    }

    /* renamed from: a */
    public final void mo31814a() {
        String str;
        TextView b = mo31815b();
        if (b != null) {
            m47054a(b, this.f56632b.f171027c);
        }
        TextView textView = (TextView) this.f56631a.findViewById(C0126R.C0129id.gh_operation_hours);
        if (textView != null) {
            if (this.f56632b.f171028d.size() != 0) {
                str = TextUtils.join("\n", this.f56632b.f171028d);
            } else {
                str = null;
            }
            m47054a(textView, str);
        }
    }
}
