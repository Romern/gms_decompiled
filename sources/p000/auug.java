package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: auug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auug extends DialogFragment {

    /* renamed from: a */
    public auue f92539a;

    /* renamed from: a */
    private final DialogInterface.OnClickListener m77827a(String str) {
        return new auuc(this, str);
    }

    /* renamed from: b */
    private final void m77834b(String str, StringBuilder sb, StringBuilder sb2) {
        sb.delete(0, sb.length());
        sb2.delete(0, sb2.length());
        if (cgzt.m147778c()) {
            sb.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_always_unlock_info, str));
            sb2.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_always_unlock_disclaimer_note, str));
            return;
        }
        sb2.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_keep_unlock_disclaimer_note, str, str));
    }

    /* renamed from: c */
    private final void m77835c(String str, StringBuilder sb, StringBuilder sb2) {
        sb.delete(0, sb.length());
        sb2.delete(0, sb2.length());
        if (cgzt.m147777b()) {
            sb.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_always_unlock_info, str));
            sb2.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_always_unlock_disclaimer_note, str));
            return;
        }
        sb2.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_keep_unlock_disclaimer_note, str, str));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f92539a = (auue) activity;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("auth_trust_agent_pref_trusted_devices_preference_key");
        int i = getArguments().getInt("auth_trust_agent_pref_trusted_devices_mode_key");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (i != 4) {
            String string2 = getArguments().getString("auth_trust_agent_pref_trusted_devices_device_alias_key");
            boolean z = true;
            if (i == 1) {
                boolean z2 = getArguments().getBoolean("auth_trust_agent_pref_trusted_device_is_wearable");
                boolean z3 = getArguments().getBoolean("auth_trust_agent_pref_is_connection_secure");
                builder.setTitle((int) C0126R.string.auth_trust_agent_trusted_Device_add_trusted_device);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                if (z2) {
                    m77833a(string2, sb, sb2);
                } else if (z3) {
                    m77834b(string2, sb, sb2);
                } else if (cgzq.m147772b()) {
                    m77835c(string2, sb, sb2);
                } else {
                    z = false;
                }
                m77832a(builder, sb, sb2);
                if (z) {
                    builder.setPositiveButton(getString(C0126R.string.auth_trust_agent_trusted_devices_add), new auua(this, string));
                }
                builder.setNegativeButton(getString(C0126R.string.common_cancel), new auub());
            } else if (i != 3) {
                boolean z4 = getArguments().getBoolean("auth_trust_agent_pref_trusted_device_is_wearable");
                auuf a = m77829a(string, z4);
                m77831a(builder, a.f92537a, string2, z4);
                builder.setPositiveButton(getString(C0126R.string.auth_trust_agent_trusted_devices_done), m77828a(a.f92538b, string));
                builder.setNegativeButton(getString(C0126R.string.auth_trust_agent_trusted_devices_remove), m77827a(string));
            } else {
                boolean z5 = getArguments().getBoolean("auth_trust_agent_pref_trusted_device_is_wearable");
                auuf a2 = m77829a(string, z5);
                m77831a(builder, a2.f92537a, string2, z5);
                if (!a2.f92538b) {
                    builder.setPositiveButton(getString(C0126R.string.auth_trust_agent_trusted_devices_done), m77828a(a2.f92538b, string));
                    builder.setNegativeButton(getString(C0126R.string.auth_trust_agent_trusted_devices_remove), m77827a(string));
                } else {
                    builder.setPositiveButton(getString(C0126R.string.auth_trust_agent_trusted_devices_remove), m77827a(string));
                    builder.setNegativeButton(getString(C0126R.string.auth_trust_agent_trusted_devices_accept), m77828a(a2.f92538b, string));
                }
            }
        } else {
            builder.setMessage(getString(C0126R.string.auth_trust_agent_trusted_devices_remove_message));
            builder.setPositiveButton(getString(C0126R.string.common_ok), new auty(this, string));
            builder.setNegativeButton(getString(C0126R.string.common_cancel), new autz(this));
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    /* renamed from: a */
    private final DialogInterface.OnClickListener m77828a(boolean z, String str) {
        return new auud(this, z, str);
    }

    /* renamed from: a */
    private static final auuf m77829a(String str, boolean z) {
        BluetoothDevice bluetoothDevice;
        try {
            bluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(auuj.m77855a(str));
        } catch (IllegalArgumentException | NullPointerException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Exception in creating BluetoothDevice: ");
            sb.append(valueOf);
            Log.e("TrustedDeviceDiaglog", sb.toString());
            bluetoothDevice = null;
        }
        boolean z2 = true;
        if (!z && !auuj.m77860b(bluetoothDevice) && !auuj.m77862c(bluetoothDevice)) {
            z2 = false;
        }
        return new auuf(bluetoothDevice, z2);
    }

    /* renamed from: a */
    public static auug m77830a(String str, String str2, int i, boolean z, boolean z2) {
        auug auug = new auug();
        Bundle bundle = new Bundle();
        bundle.putString("auth_trust_agent_pref_trusted_devices_preference_key", str);
        bundle.putString("auth_trust_agent_pref_trusted_devices_device_alias_key", str2);
        bundle.putInt("auth_trust_agent_pref_trusted_devices_mode_key", i);
        bundle.putBoolean("auth_trust_agent_pref_trusted_device_is_wearable", z);
        if (i == 1) {
            bundle.putBoolean("auth_trust_agent_pref_is_connection_secure", z2);
        }
        auug.setArguments(bundle);
        return auug;
    }

    /* renamed from: a */
    private final void m77831a(AlertDialog.Builder builder, BluetoothDevice bluetoothDevice, String str, boolean z) {
        builder.setTitle(str);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            m77833a(str, sb, sb2);
        } else if (auuj.m77860b(bluetoothDevice)) {
            m77834b(str, sb, sb2);
        } else if (auuj.m77862c(bluetoothDevice)) {
            m77835c(str, sb, sb2);
        } else {
            sb.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_not_connected_info, str));
        }
        m77832a(builder, sb, sb2);
    }

    /* renamed from: a */
    private final void m77832a(AlertDialog.Builder builder, StringBuilder sb, StringBuilder sb2) {
        String sb3 = sb.toString();
        String sb4 = sb2.toString();
        String string = getString(C0126R.string.auth_trust_agent_trusted_bt_device_learn_more_about_security);
        String str = "";
        String str2 = (!TextUtils.isEmpty(sb4) && !TextUtils.isEmpty(sb3)) ? "<br/><br/>" : str;
        if (!TextUtils.isEmpty(string)) {
            String valueOf = String.valueOf(string);
            str = valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf);
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(sb3).length() + str2.length() + String.valueOf(sb4).length() + String.valueOf(str).length());
        sb5.append(sb3);
        sb5.append(str2);
        sb5.append(sb4);
        sb5.append(str);
        String sb6 = sb5.toString();
        TextView textView = (TextView) ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.auth_trusted_device_info_dialog, (ViewGroup) null);
        textView.setText(Html.fromHtml(sb6));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        builder.setView(textView);
    }

    /* renamed from: a */
    private final void m77833a(String str, StringBuilder sb, StringBuilder sb2) {
        sb.delete(0, sb.length());
        sb2.delete(0, sb2.length());
        sb.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_wearable_info, str));
        sb2.append(getString(C0126R.string.auth_trust_agent_trusted_bt_device_always_unlock_disclaimer_note, str));
    }
}
