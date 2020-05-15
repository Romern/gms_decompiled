package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* renamed from: agvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvn {

    /* renamed from: a */
    private static final bnhe f66663a = bnhe.m109411a("THB", "฿", "GTQ", "Q", "BRL", "R$", "MMK", "Ks");

    /* renamed from: b */
    private static final srn f66664b = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static int m55178a(int i) {
        if (i == 0) {
            return C0126R.string.pmtcs_generic;
        }
        switch (i - 2) {
            case 2:
            case 3:
            case 8:
                return C0126R.string.pmtcs_video;
            case 4:
                return C0126R.string.pmtcs_music;
            case 5:
                return C0126R.string.pmtcs_gaming;
            case 6:
                return C0126R.string.pmtcs_social;
            case 7:
                return C0126R.string.pmtcs_messaging;
            default:
                return C0126R.string.pmtcs_generic;
        }
    }

    /* renamed from: a */
    public static int m55179a(int i, boolean z) {
        if (i == 0) {
            return !z ? C0126R.C0127drawable.quantum_ic_data_usage_black_24 : C0126R.C0127drawable.quantum_ic_data_usage_googblue_24;
        }
        switch (i - 2) {
            case 2:
            case 3:
            case 8:
                return !z ? C0126R.C0127drawable.quantum_ic_video_library_black_24 : C0126R.C0127drawable.quantum_ic_video_library_googblue_24;
            case 4:
                return !z ? C0126R.C0127drawable.quantum_ic_music_note_black_24 : C0126R.C0127drawable.quantum_ic_music_note_googblue_24;
            case 5:
                return !z ? C0126R.C0127drawable.quantum_ic_play_games_black_24 : C0126R.C0127drawable.quantum_ic_play_games_googblue_24;
            case 6:
                return !z ? C0126R.C0127drawable.quantum_ic_group_black_24 : C0126R.C0127drawable.quantum_ic_group_googblue_24;
            case 7:
                return !z ? C0126R.C0127drawable.quantum_ic_message_black_24 : C0126R.C0127drawable.quantum_ic_message_googblue_24;
            default:
                return !z ? C0126R.C0127drawable.quantum_ic_data_usage_black_24 : C0126R.C0127drawable.quantum_ic_data_usage_googblue_24;
        }
    }

    /* renamed from: b */
    public static String m55186b(View view) {
        if (view == null) {
            return null;
        }
        try {
            return view.getResources().getResourceName(view.getId());
        } catch (Resources.NotFoundException e) {
            view.getId();
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public static String m55180a(long j, String str) {
        String b = bmwb.m108444b(str);
        double a = agze.m55326a(j);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(b));
        if (cfma.f184331a.mo6606a().mo81447f() && a % 1.0d == 0.0d) {
            currencyInstance.setMaximumFractionDigits(0);
        }
        String format = currencyInstance.format(a);
        if (!format.contains(b) || !cfnm.f184575a.mo6606a().mo81673f()) {
            return format;
        }
        if (!cfnm.f184575a.mo6606a().mo81678k() || !f66663a.containsKey(b)) {
            String replace = format.replace(160, ' ');
            String valueOf = String.valueOf(b);
            if (replace.contains(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf)) || format.replace(160, ' ').contains(String.valueOf(b).concat(" "))) {
                return format;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2);
            sb.append(" ");
            sb.append(b);
            sb.append(" ");
            return format.replace(b, sb.toString()).trim();
        } else if (!cfnm.m140638i() || !b.equals("MMK")) {
            return format.replace(b, (CharSequence) f66663a.get(b));
        } else {
            String valueOf2 = String.valueOf(format.replace(b, ""));
            String valueOf3 = String.valueOf((String) f66663a.get(b));
            return valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
        }
    }

    /* renamed from: a */
    public static String m55181a(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        return (mdpCarrierPlanIdResponse == null || TextUtils.isEmpty(mdpCarrierPlanIdResponse.f80153c)) ? "" : mdpCarrierPlanIdResponse.f80153c;
    }

    /* renamed from: a */
    public static String m55182a(MdpDataPlanStatus mdpDataPlanStatus, Context context) {
        if (!TextUtils.isEmpty(mdpDataPlanStatus.f80171j)) {
            return mdpDataPlanStatus.f80171j;
        }
        if (!TextUtils.isEmpty(mdpDataPlanStatus.f80163b)) {
            return mdpDataPlanStatus.f80163b;
        }
        if (mdpDataPlanStatus.f80166e != Long.MAX_VALUE) {
            return context.getString(C0126R.string.default_plan_name);
        }
        String string = context.getString(C0126R.string.unlimited);
        String string2 = context.getString(C0126R.string.default_plan_name);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" ");
        sb.append(string2);
        return agze.m55343e(sb.toString());
    }

    /* renamed from: a */
    public static void m55183a(View view) {
        view.setVisibility(8);
        abv abv = (abv) view.getLayoutParams();
        if (abv != null) {
            abv.height = 0;
            abv.width = 0;
            view.setLayoutParams(abv);
        }
    }

    /* renamed from: a */
    public static void m55184a(String str, Context context, TextView textView) {
        m55185a(str, context, textView, C0126R.string.expired_in);
    }

    /* renamed from: a */
    public static boolean m55185a(String str, Context context, TextView textView, int i) {
        String str2;
        try {
            long c = agze.m55341c(str);
            if (c < 0) {
                ((bnsl) f66664b.mo68388c()).mo68405a("Negative expiration time duration");
                textView.setVisibility(8);
                return false;
            }
            long days = TimeUnit.MILLISECONDS.toDays(c);
            if (cfnm.m140636g() <= 0 || days < cfnm.m140636g()) {
                if (days != 0) {
                    str2 = context.getResources().getQuantityString(C0126R.plurals.unit_days, (int) days, Long.valueOf(days));
                } else {
                    str2 = agze.m55330a(c, context);
                }
                textView.setText(context.getString(i, str2));
                if (days == 0) {
                    textView.setTextAppearance(context, 16974319);
                    textView.setTextColor(context.getResources().getColor(C0126R.color.google_yellow_900));
                }
                return true;
            }
            textView.setVisibility(8);
            return false;
        } catch (ParseException e) {
            e.getMessage();
            textView.setVisibility(8);
            return false;
        }
    }
}
