package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bkcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkcz extends bkbk implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public bkcy f124032a;

    /* renamed from: b */
    private Context f124033b;

    /* renamed from: a */
    public static bkcz m105336a() {
        return m105337a(2, (int) C0126R.string.wallet_uic_network_error_title, (int) C0126R.string.wallet_uic_network_error_message, 1000);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        bkcy bkcy = this.f124032a;
        if (bkcy != null) {
            bkcy.mo52044a(2, getArguments().getInt("errorCode"));
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bkbj bkbj;
        String str;
        CharSequence charSequence;
        Bundle arguments = getArguments();
        this.f124033b = getActivity();
        if (arguments.containsKey("themeResourceId")) {
            int i = arguments.getInt("themeResourceId");
            this.f124033b = new C1416ut(this.f124033b, i);
            bkbj = new bkbj(this.f124033b, i);
        } else {
            bkbj = new bkbj(this.f124033b);
        }
        if (arguments.containsKey("titleId")) {
            str = getString(arguments.getInt("titleId"));
        } else {
            str = arguments.getString("title");
        }
        if (!TextUtils.isEmpty(str)) {
            bkbj.mo65780a(str);
        }
        if (arguments.containsKey("messageId")) {
            charSequence = getString(arguments.getInt("messageId"));
        } else {
            charSequence = bkfr.m105590b(arguments.getString("message"));
        }
        TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.view_dialog_body_text, (ViewGroup) null);
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        bkbj.mo65783b(textView);
        boolean z = true;
        int i2 = arguments.getInt("buttonMode", 1);
        if (i2 == 1 || i2 == 4) {
            if (i2 != 4) {
                z = false;
            }
            setCancelable(z);
            bkbj.mo65782b(17039370, new bkct(this, arguments));
        } else if (i2 == 3) {
            setCancelable(true);
            bkbj.mo65782b(17039370, new bkcu(this, arguments));
            bkbj.mo65778a(17039360, new bkcv(this, arguments));
        } else if (i2 == 2) {
            setCancelable(true);
            bkbj.mo65782b((int) C0126R.string.wallet_uic_retry, new bkcw(this, arguments));
            bkbj.mo65778a(17039360, new bkcx(this, arguments));
        }
        Dialog a = bkbj.mo65776a();
        a.setOnShowListener(this);
        return a;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Context context;
        if ((dialogInterface instanceof C1350sh) && (context = this.f124033b) != null) {
            int a = bkfr.m105542a(context, (int) C0126R.attr.uicColorMaterialAccent);
            C1350sh shVar = (C1350sh) dialogInterface;
            shVar.mo15913a(-1).setTextColor(a);
            shVar.mo15913a(-2).setTextColor(a);
        }
    }

    /* renamed from: a */
    public static bkcz m105337a(int i, int i2, int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("buttonMode", i);
        bundle.putInt("titleId", i2);
        bundle.putInt("messageId", i3);
        bundle.putInt("errorCode", i4);
        bkcz bkcz = new bkcz();
        bkcz.setArguments(bundle);
        return bkcz;
    }

    /* renamed from: a */
    public static bkcz m105338a(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("buttonMode", i);
        bundle.putString("title", str);
        bundle.putString("message", str2);
        bundle.putInt("errorCode", i2);
        bkcz bkcz = new bkcz();
        bkcz.setArguments(bundle);
        return bkcz;
    }
}
