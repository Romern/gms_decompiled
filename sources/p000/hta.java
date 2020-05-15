package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.AccountChipView;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialPickerChimeraActivity;

/* renamed from: hta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hta implements bqfp {

    /* renamed from: a */
    final /* synthetic */ CredentialPickerChimeraActivity f20391a;

    public hta(CredentialPickerChimeraActivity credentialPickerChimeraActivity) {
        this.f20391a = credentialPickerChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        TextView textView;
        bngx bngx = (bngx) obj;
        if (bngx.isEmpty()) {
            this.f20391a.mo7431a(1002, 102);
            return;
        }
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.f20391a;
        credentialPickerChimeraActivity.f10156f = bmxv.m108566b(bngx);
        credentialPickerChimeraActivity.f10157g.clear();
        credentialPickerChimeraActivity.f10157g.addAll(bngx.m109355a(bnjd.m109575a((Iterable) bngx, hsx.f20387a)));
        credentialPickerChimeraActivity.f10157g.notifyDataSetChanged();
        if (credentialPickerChimeraActivity.f10154d.mo66813a()) {
            textView = (TextView) credentialPickerChimeraActivity.findViewById(C0126R.C0129id.credentials_picker_title);
            String a = hds.m14227a(credentialPickerChimeraActivity, hds.m14228a(credentialPickerChimeraActivity.f10152b));
            textView.setText(String.format(credentialPickerChimeraActivity.getResources().getString(C0126R.string.credentials_picker_title), a));
        } else {
            textView = (TextView) credentialPickerChimeraActivity.findViewById(C0126R.C0129id.credentials_hint_picker_title);
        }
        textView.setVisibility(0);
        AccountChipView accountChipView = (AccountChipView) credentialPickerChimeraActivity.findViewById(C0126R.C0129id.add_account);
        if (credentialPickerChimeraActivity.mo7434g().f10101b) {
            hsl hsl = new hsl();
            hsl.mo12695a(C0126R.C0127drawable.ic_add_circle_grey600_40dp, true);
            hsl.f20367d = credentialPickerChimeraActivity.getString(C0126R.string.common_add_account);
            accountChipView.mo7426a(hsl.mo12693a());
            accountChipView.setOnClickListener(credentialPickerChimeraActivity);
            accountChipView.setVisibility(0);
        } else {
            accountChipView.setVisibility(8);
        }
        View findViewById = credentialPickerChimeraActivity.findViewById(C0126R.C0129id.cancel);
        View findViewById2 = credentialPickerChimeraActivity.findViewById(C0126R.C0129id.button_area);
        if (credentialPickerChimeraActivity.mo7434g().f10102c) {
            findViewById2.setVisibility(0);
            findViewById.setOnClickListener(credentialPickerChimeraActivity);
        } else {
            findViewById2.setVisibility(8);
        }
        if (credentialPickerChimeraActivity.f10155e.mo66813a()) {
            credentialPickerChimeraActivity.mo7432a((InternalCredentialWrapper) credentialPickerChimeraActivity.f10155e.mo66814b());
            return;
        }
        credentialPickerChimeraActivity.f10158h.setEnabled(true);
        credentialPickerChimeraActivity.f10159i.stop();
        credentialPickerChimeraActivity.findViewById(C0126R.C0129id.progress_indicator_container).setVisibility(8);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f20391a.mo7431a(0, 2);
    }
}
