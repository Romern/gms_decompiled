package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aazy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazy extends DialogFragment {

    /* renamed from: a */
    public String f56911a;

    /* renamed from: b */
    public String f56912b;

    /* renamed from: c */
    public String f56913c;

    /* renamed from: d */
    public bzpb f56914d;

    /* renamed from: e */
    abab f56915e;

    /* renamed from: f */
    Switch f56916f;

    /* renamed from: g */
    public HelpConfig f56917g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31961a(int i) {
        if (!TextUtils.isEmpty(this.f56913c) && (getActivity() instanceof aasf)) {
            abcx.m47504b((aasf) getActivity(), i, this.f56913c);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bzpb bzpb;
        int a;
        if (bundle != null) {
            this.f56911a = bundle.getString("setting_title");
            this.f56912b = bundle.getString("setting_snippet");
            this.f56913c = bundle.getString("metrics_url");
            this.f56917g = (HelpConfig) bundle.getParcelable("EXTRA_HELP_CONFIG");
            try {
                this.f56914d = (bzpb) GeneratedMessageLite.m124016a(bzpb.f170891d, bundle.getByteArray("setting_action_definition"), bxus.m123744c());
            } catch (bxwf e) {
                Log.e("gH_SettingActionDialog", "Failed to parse AndroidSettingDefinition proto", e);
            }
        }
        abab abab = this.f56915e;
        if (abab == null) {
            abab = new abab(getActivity());
        }
        this.f56915e = abab;
        View view = null;
        r0 = null;
        Intent intent = null;
        view = null;
        view = null;
        view = null;
        view = null;
        view = null;
        if (!TextUtils.isEmpty(this.f56911a) && (bzpb = this.f56914d) != null && (a = bzpa.m126002a(bzpb.f170894b)) != 0 && a == 2 && this.f56915e.mo31963a(this.f56914d)) {
            View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.gh_setting_action_scrollable_dialog_fragment, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0126R.C0129id.gh_setting_action_dialog_title)).setText(Html.fromHtml(this.f56911a));
            this.f56916f = (Switch) inflate.findViewById(C0126R.C0129id.gh_setting_action_dialog_switch);
            Boolean c = this.f56915e.mo31965c(this.f56914d);
            if (c != null) {
                this.f56916f.setChecked(c.booleanValue());
                this.f56916f.setOnCheckedChangeListener(new aazv(this));
                TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.gh_setting_action_dialog_snippet);
                if (!TextUtils.isEmpty(this.f56912b)) {
                    textView.setText(Html.fromHtml(this.f56912b));
                } else {
                    textView.setVisibility(8);
                }
                Button button = (Button) inflate.findViewById(C0126R.C0129id.gh_setting_action_dialog_intent_button);
                Intent b = this.f56915e.mo31964b(this.f56914d);
                if (b != null && spn.m35860a(getActivity(), b)) {
                    intent = b;
                }
                if (intent != null) {
                    button.setOnClickListener(new aazw(this, intent));
                } else {
                    button.setVisibility(8);
                }
                ((Button) inflate.findViewById(C0126R.C0129id.gh_setting_action_dialog_done_button)).setOnClickListener(new aazx(this));
                view = inflate;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (view == null) {
            mo31961a(MfiClientException.TYPE_MFICLIENT_STARTED);
            builder.setMessage((int) C0126R.string.common_something_went_wrong);
            builder.setPositiveButton((int) C0126R.string.common_ok, new aazu(this));
        } else {
            builder.setView(view);
        }
        return builder.create();
    }

    public final void onResume() {
        Boolean c;
        super.onResume();
        if (this.f56916f != null && (c = this.f56915e.mo31965c(this.f56914d)) != null) {
            this.f56916f.setChecked(c.booleanValue());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f56911a)) {
            bundle.putString("setting_title", this.f56911a);
        }
        if (!TextUtils.isEmpty(this.f56912b)) {
            bundle.putString("setting_snippet", this.f56912b);
        }
        bzpb bzpb = this.f56914d;
        if (bzpb != null) {
            bundle.putByteArray("setting_action_definition", bzpb.serializeToBytes());
        }
        if (!TextUtils.isEmpty(this.f56913c)) {
            bundle.putString("metrics_url", this.f56913c);
        }
        HelpConfig helpConfig = this.f56917g;
        if (helpConfig != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", helpConfig);
        }
    }
}
