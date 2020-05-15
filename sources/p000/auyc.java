package p000;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesSettingsChimeraActivity;

/* renamed from: auyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auyc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f92765a;

    /* renamed from: b */
    final /* synthetic */ String f92766b;

    /* renamed from: c */
    final /* synthetic */ String f92767c;

    /* renamed from: d */
    final /* synthetic */ auyf f92768d;

    public auyc(auyf auyf, EditText editText, String str, String str2) {
        this.f92768d = auyf;
        this.f92765a = editText;
        this.f92766b = str;
        this.f92767c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!TextUtils.isEmpty(this.f92765a.getText().toString().trim())) {
            ((TrustedPlacesSettingsChimeraActivity) this.f92768d.getActivity()).mo59591j().mo51051a(auxi.m78035i(this.f92766b), this.f92765a.getText().toString(), this.f92767c);
            this.f92768d.f92770a.mo51044a(this.f92766b, this.f92765a.getText().toString());
        }
    }
}
