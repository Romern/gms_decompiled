package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: azlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azlx extends azlc {

    /* renamed from: a */
    public int f99598a = 0;

    /* renamed from: b */
    protected int f99599b = -2;

    /* renamed from: c */
    protected int f99600c = -2;

    /* renamed from: d */
    protected int f99601d = -2;

    /* renamed from: e */
    public azlw f99602e;

    /* renamed from: f */
    public Button f99603f;

    /* renamed from: g */
    public aznz f99604g;

    /* renamed from: h */
    private int f99605h = 0;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f99602e = (azlw) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement MuteDialogListener"));
        }
    }

    public final void onDetach() {
        super.onDetach();
        this.f99602e = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        azlw azlw = this.f99602e;
        if (azlw != null) {
            azlw.mo55036l();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        this.f99604g = aznz.m85891a(getArguments().getString("ConversationId"));
        this.f99599b = 0;
        this.f99600c = 1;
        int i = 2;
        if (!getArguments().getBoolean("isBusinessChat")) {
            this.f99601d = 2;
            i = 3;
        } else {
            this.f99601d = -2;
        }
        this.f99605h = i;
        int i2 = Build.VERSION.SDK_INT;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), 2132019837);
        AlertDialog.Builder title = builder.setTitle((int) C0126R.string.common_block);
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.ms_mute_prompt, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.mute_prompt_text);
        int i3 = getArguments().getInt("customTextResId");
        if (i3 == 0) {
            i3 = C0126R.string.mute_conversation_text;
        }
        textView.setText(i3);
        ListView listView = (ListView) inflate.findViewById(C0126R.C0129id.mute_options);
        String[] strArr = new String[this.f99605h];
        int i4 = this.f99599b;
        if (i4 != -2) {
            int i5 = getArguments().getInt("customBlockNumberTextResId");
            if (i5 != 0) {
                str = getString(i5);
            } else {
                str = getString(C0126R.string.mute_person_item);
            }
            strArr[i4] = str;
        }
        int i6 = this.f99600c;
        if (i6 != -2) {
            strArr[i6] = getString(C0126R.string.report_spam_item);
        }
        int i7 = this.f99601d;
        if (i7 != -2) {
            strArr[i7] = getString(C0126R.string.mute_app_item, getArguments().getString("appName"));
        }
        listView.setAdapter((ListAdapter) new ArrayAdapter(getActivity(), (int) C0126R.C0128layout.ms_mute_option_item, strArr));
        listView.setOnItemClickListener(new azlv(this));
        title.setView(inflate).setPositiveButton(17039370, new azlt(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.setOnShowListener(new azlu(this, create));
        return create;
    }
}
