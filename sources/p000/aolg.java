package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: aolg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aolg extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private ArrayList f78388a;

    /* renamed from: b */
    private aolf f78389b;

    /* renamed from: c */
    private EditText f78390c;

    /* renamed from: d */
    private TextView f78391d;

    /* renamed from: e */
    private TextView f78392e;

    /* renamed from: a */
    private final void m65984a(boolean z) {
        Button button = ((AlertDialog) getDialog()).getButton(-1);
        if (button != null) {
            button.setEnabled(z);
        } else if (Log.isLoggable("ShareBox", 5)) {
            Log.w("ShareBox", "Unable to toggle create circle dialog button enabled state");
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f78389b = (aolf) activity;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(aolf.class.getSimpleName());
            throw new ClassCastException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f78389b.mo42955d();
        dismiss();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            m65984a(false);
            this.f78389b.mo42954a(this.f78390c.getText().toString());
            dismiss();
            return;
        }
        onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78388a = getArguments().getParcelableArrayList("circles");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_sharebox_create_circle_view, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.circle_name);
        this.f78390c = editText;
        editText.addTextChangedListener(new aole(this));
        this.f78391d = (TextView) inflate.findViewById(C0126R.C0129id.circle_name_warning);
        this.f78392e = (TextView) inflate.findViewById(C0126R.C0129id.circle_name_length_warning);
        AlertDialog create = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019651)).setTitle((int) C0126R.string.plus_sharebox_circles_add_title).setView(inflate).setPositiveButton(17039370, this).setNegativeButton(17039360, this).setCancelable(true).create();
        create.getWindow().setSoftInputMode(4);
        return create;
    }

    public final void onResume() {
        super.onResume();
        mo42956a(this.f78390c.getText());
    }

    /* renamed from: a */
    public final void mo42956a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList = this.f78388a;
            if (arrayList != null && !arrayList.isEmpty() && !TextUtils.isEmpty(charSequence)) {
                int size = this.f78388a.size();
                int i = 0;
                while (i < size) {
                    if (!((Circle) this.f78388a.get(i)).f83446e.equalsIgnoreCase(charSequence.toString())) {
                        i++;
                    } else {
                        m65984a(false);
                        this.f78391d.setVisibility(0);
                        return;
                    }
                }
            }
            if (charSequence.length() > ((Integer) ansx.f77673W.mo25081c()).intValue()) {
                m65984a(false);
                this.f78392e.setVisibility(0);
                return;
            }
            m65984a(true);
            this.f78391d.setVisibility(8);
            this.f78392e.setVisibility(8);
            return;
        }
        m65984a(false);
        this.f78391d.setVisibility(8);
    }
}
