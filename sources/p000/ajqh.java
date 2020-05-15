package p000;

import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqh */
public final /* synthetic */ class ajqh implements View.OnClickListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71144a;

    public ajqh(SetupChimeraActivity setupChimeraActivity) {
        this.f71144a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.f71144a;
        View inflate = View.inflate(setupChimeraActivity, C0126R.C0128layout.sharing_dialog_device_name, null);
        EditText editText = (EditText) inflate.findViewById(16908308);
        C1349sg sgVar = new C1349sg(setupChimeraActivity);
        sgVar.mo15905b((int) C0126R.string.sharing_settings_button_device_name);
        sgVar.mo15906b((int) C0126R.string.common_ok, new ajra(setupChimeraActivity, editText));
        sgVar.mo15892a((int) C0126R.string.common_cancel, ajqi.f71145a);
        sgVar.mo15907b(inflate);
        C1350sh b = sgVar.mo15904b();
        editText.setFilters(new InputFilter[]{new butm(setupChimeraActivity.getResources().getInteger(C0126R.integer.sharing_max_name_length_bytes))});
        editText.setOnEditorActionListener(new ajqj(setupChimeraActivity, b, editText));
        editText.addTextChangedListener(new ajrb(b, editText));
        b.setOnShowListener(new ajqk(setupChimeraActivity, editText, b));
        b.getWindow().setSoftInputMode(36);
        setupChimeraActivity.f70615c.mo38912e().mo50373a(new ajql(setupChimeraActivity, editText, b));
    }
}
