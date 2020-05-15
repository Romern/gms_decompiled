package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tcz extends AsyncTask {

    /* renamed from: a */
    final WeakReference f45665a;

    /* renamed from: b */
    List f45666b;

    /* renamed from: c */
    boolean f45667c;

    /* renamed from: d */
    boolean f45668d;

    /* renamed from: e */
    long f45669e;

    /* renamed from: f */
    long f45670f;

    /* renamed from: g */
    long f45671g;

    /* renamed from: h */
    long f45672h;

    /* renamed from: i */
    long f45673i;

    public tcz(ConstellationDebugChimeraActivity constellationDebugChimeraActivity) {
        this.f45665a = new WeakReference(constellationDebugChimeraActivity);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        szq a = szq.m36667a((Context) this.f45665a.get());
        this.f45667c = a.mo26292c();
        this.f45668d = a.mo26300k();
        this.f45669e = a.mo26293d();
        this.f45670f = a.mo26295f();
        this.f45672h = a.f45525b.getLong("last_consent_check_with_server_time_millis", -1);
        this.f45673i = a.mo26294e();
        this.f45671g = a.mo26296g();
        try {
            szr.m36692a();
            this.f45666b = szr.m36699d();
            return null;
        } catch (tdw e) {
            ConstellationDebugChimeraActivity.f30575b.mo25418e("Couldn't read verifications", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        cbqn cbqn;
        cbqn cbqn2;
        cbqn cbqn3;
        cbra cbra;
        cbra cbra2;
        cbra cbra3;
        String str;
        Void voidR = (Void) obj;
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = (ConstellationDebugChimeraActivity) this.f45665a.get();
        TextView textView = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.summary);
        TextView textView2 = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.device_consent);
        TextView textView3 = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.last_consent_check);
        TextView textView4 = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.last_client_state_check);
        TextView textView5 = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.next_verification_check);
        TextView textView6 = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.rpc_last_consent_check_state);
        TextView textView7 = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.rpc_last_sync_check_state);
        boolean z = false;
        if (!this.f45667c) {
            textView.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_no_consent_summary));
            textView2.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_no_consent));
        } else {
            Object[] objArr = new Object[1];
            if (!this.f45668d) {
                str = "MANUAL";
            } else {
                str = "AUTO";
            }
            objArr[0] = str;
            textView2.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_consent, objArr));
        }
        long j = this.f45669e;
        if (j > 0) {
            textView3.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_last_consent_time, new Object[]{tdo.m36765b(j)}));
        } else {
            textView3.setVisibility(8);
        }
        long j2 = this.f45670f;
        if (j2 > 0) {
            textView4.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_last_client_state_check_time, new Object[]{tdo.m36765b(j2)}));
        } else {
            textView4.setVisibility(8);
        }
        long j3 = this.f45671g;
        if (j3 > 0) {
            textView5.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_next_sync_time, new Object[]{tdo.m36765b(j3)}));
        } else {
            textView5.setVisibility(8);
        }
        long j4 = this.f45672h;
        if (j4 > 0) {
            textView6.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_last_consent_check_state, new Object[]{tdo.m36765b(j4)}));
        }
        long j5 = this.f45673i;
        if (j5 > 0) {
            textView7.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_last_sync_check_state, new Object[]{tdo.m36765b(j5)}));
        }
        LinearLayout linearLayout = (LinearLayout) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.sim_verifications);
        ArrayList arrayList = new ArrayList();
        List list = this.f45666b;
        if (list == null || list.isEmpty()) {
            textView.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_no_verified_numbers));
            TextView textView8 = new TextView(constellationDebugChimeraActivity);
            textView8.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_no_sim_verifications));
            linearLayout.addView(textView8);
            return;
        }
        List list2 = this.f45666b;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            cbqy cbqy = (cbqy) list2.get(i);
            if (cbqy.f178083a == 3 && !((cbra) cbqy.f178084b).f178097a.isEmpty()) {
                if (cbqy.f178083a == 3) {
                    cbra3 = (cbra) cbqy.f178084b;
                } else {
                    cbra3 = cbra.f178095c;
                }
                arrayList.add(cbra3.f178097a);
            }
            LinearLayout linearLayout2 = (LinearLayout) constellationDebugChimeraActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.verification_row, linearLayout, z);
            TextView textView9 = (TextView) linearLayout2.findViewById(C0126R.C0129id.imsis_value_tv);
            TextView textView10 = (TextView) linearLayout2.findViewById(C0126R.C0129id.verification_2);
            TextView textView11 = (TextView) linearLayout2.findViewById(C0126R.C0129id.verification_3);
            TextView textView12 = (TextView) linearLayout2.findViewById(C0126R.C0129id.phone_number_tv);
            TextView textView13 = (TextView) linearLayout2.findViewById(C0126R.C0129id.verification_4);
            List list3 = list2;
            TextView textView14 = (TextView) linearLayout2.findViewById(C0126R.C0129id.verification_5);
            TextView textView15 = textView;
            int i2 = size;
            ArrayList arrayList2 = arrayList;
            ((TextView) linearLayout2.findViewById(C0126R.C0129id.verification_1)).setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_imsis_label, new Object[]{""}));
            cbqz cbqz = cbqy.f178085c;
            if (cbqz == null) {
                cbqz = cbqz.f178091c;
            }
            if (cbqz.f178093a == 1) {
                cbqn = (cbqn) cbqz.f178094b;
            } else {
                cbqn = cbqn.f178043d;
            }
            cbqp cbqp = cbqn.f178045a;
            if (cbqp == null) {
                cbqp = cbqp.f178048c;
            }
            textView9.setText(TextUtils.join(", ", cbqp.f178050a));
            int b = cbqx.m128116b(cbqy.f178086d);
            if (b == 0) {
                b = 1;
            }
            int i3 = b - 2;
            if (i3 == 0) {
                textView10.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_state_unknown));
            } else if (i3 == 1) {
                textView10.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_state_none));
            } else if (i3 == 2) {
                textView10.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_state_pending));
            } else if (i3 == 3) {
                textView10.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_state_verified));
            }
            int b2 = cbqx.m128116b(cbqy.f178086d);
            if (b2 != 0 && b2 == 5) {
                textView11.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_phone_number_label, new Object[]{""}));
                if (cbqy.f178083a == 3) {
                    cbra = (cbra) cbqy.f178084b;
                } else {
                    cbra = cbra.f178095c;
                }
                textView12.setText(cbra.f178097a);
                textView11.setVisibility(0);
                textView12.setVisibility(0);
                Object[] objArr2 = new Object[1];
                if (cbqy.f178083a == 3) {
                    cbra2 = (cbra) cbqy.f178084b;
                } else {
                    cbra2 = cbra.f178095c;
                }
                bxyk bxyk = cbra2.f178098b;
                if (bxyk == null) {
                    bxyk = bxyk.f165095c;
                }
                objArr2[0] = tdo.m36765b(tdo.m36763a(bxyk));
                textView13.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_verification_time_label, objArr2));
                textView13.setVisibility(0);
                bxwc bxwc = cbqy.f178088f;
                int size2 = bxwc.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    cbqe cbqe = (cbqe) bxwc.get(i4);
                    if (cbqe.f178012a.equals("verification_method") && !cbqe.f178013b.isEmpty()) {
                        textView14.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_verification_method_label, new Object[]{cbqe.f178013b}));
                        textView14.setVisibility(0);
                        break;
                    }
                    i4++;
                }
            } else {
                cbqz cbqz2 = cbqy.f178085c;
                if (cbqz2 == null) {
                    cbqz2 = cbqz.f178091c;
                }
                if (cbqz2.f178093a == 1) {
                    cbqn2 = (cbqn) cbqz2.f178094b;
                } else {
                    cbqn2 = cbqn.f178043d;
                }
                cbqp cbqp2 = cbqn2.f178045a;
                if (cbqp2 == null) {
                    cbqp2 = cbqp.f178048c;
                }
                if (!cbqp2.f178051b.isEmpty()) {
                    textView11.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_sim_number_label, new Object[]{""}));
                    cbqz cbqz3 = cbqy.f178085c;
                    if (cbqz3 == null) {
                        cbqz3 = cbqz.f178091c;
                    }
                    if (cbqz3.f178093a == 1) {
                        cbqn3 = (cbqn) cbqz3.f178094b;
                    } else {
                        cbqn3 = cbqn.f178043d;
                    }
                    cbqp cbqp3 = cbqn3.f178045a;
                    if (cbqp3 == null) {
                        cbqp3 = cbqp.f178048c;
                    }
                    textView12.setText(cbqp3.f178051b);
                    textView11.setVisibility(0);
                    textView12.setVisibility(0);
                } else {
                    textView11.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_no_sim_number_label));
                    textView12.setText("");
                    textView11.setVisibility(0);
                    textView12.setVisibility(0);
                }
            }
            linearLayout.addView(linearLayout2);
            i++;
            list2 = list3;
            size = i2;
            textView = textView15;
            arrayList = arrayList2;
            z = false;
        }
        textView.setText(constellationDebugChimeraActivity.getString(C0126R.string.c11n_verified_numbers, new Object[]{TextUtils.join(", ", arrayList)}));
    }
}
