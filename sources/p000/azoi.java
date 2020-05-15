package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: azoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoi {
    /* renamed from: a */
    public static int m85917a(Context context, Intent intent, int i, boolean z) {
        if (TextUtils.isEmpty(intent.getPackage()) || !azpi.m86078b(context, intent.getPackage())) {
            return 1;
        }
        if (z && !azpi.m86085c(context, intent.getPackage())) {
            return 2;
        }
        PackageManager packageManager = context.getPackageManager();
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 == 2 && packageManager.queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).isEmpty()) {
                return 3;
            }
            return 0;
        } else if (packageManager.queryIntentServices(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).isEmpty()) {
            return 3;
        } else {
            return 0;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: b */
    protected static Intent m85927b(Context context, aznz aznz, Intent intent) {
        Intent intent2 = new Intent(intent);
        int i = 1;
        intent2.setClassName(context, "com.google.android.gms.matchstick.ui.MessageActivity").putExtra("server_app_id", aznz.f99775b).putExtra("message_activity_conv_id", aznz.f99774a).putExtra("message_activity_display_user_id", azot.m85962a(context, aznz.f99779f)).putExtra("is_first_time_open_conversation", !azcm.m85300a(context).mo54668f(aznz.f99774a));
        if (cfeo.m138892w() && cfeo.m138874e() && aznz.mo55107e()) {
            new Object[1][0] = aznz;
            String str = aznz.f99777d;
            azdi b = azdj.m85399a(context).mo54722b(aznz.f99781h);
            if (b != null) {
                String str2 = b.f99080f;
                if (!TextUtils.isEmpty(str2)) {
                    intent2.putExtra("message_activity_is_business_compose_extra", true).putExtra("message_activity_bot_id_extra", str).putExtra("message_activity_bot_name_extra", str2).putExtra("branding_app_id", "businessmessaging");
                    if (azdl.m85412a(context).mo54802x() && (!azdl.m85412a(context).mo54770e() || (cfec.m138765b() && bmxi.m108538a(azcv.m85357a(context).mo54692a(true), azcv.f99014b)))) {
                        intent2.putExtra("invoke_with_anonymous_registration", true).putExtra("wait_for_anonymous_registration_finish", false);
                    }
                }
            } else {
                azoj.m85933c("IntentUtil", "Null profileData when trying to add business chat extras to intent", new Object[0]);
                azph.m85998a(context).mo55126a(67, 44);
            }
        }
        Cursor a = azcd.m85252a(context).mo54598a(aznz.f99775b, new String[]{"install_url", "name", "pid", "app_ui_config", "app_theme", "app_string_tag_mapping"});
        Bundle bundle = null;
        if (a != null) {
            if (a.moveToFirst()) {
                bundle = new Bundle();
                bundle.putString("com.google.android.apps.libraries.matchstick.action.appUrl", a.getString(0));
                bundle.putString("com.google.android.apps.libraries.matchstick.action.appName", a.getString(1));
                bundle.putString("com.google.android.apps.libraries.matchstick.action.appPkg", a.getString(2));
                cbht cbht = (cbht) azol.m85935a((bxxk) cbht.f177177g.mo74142c(7), a.getBlob(3));
                if (cbht != null) {
                    int b2 = cbhs.m127867b(cbht.f177179a);
                    if (b2 != 0) {
                        i = b2;
                    }
                    bundle.putInt("com.google.android.apps.libraries.matchstick.action.canvasType", cbhs.m127866a(i));
                    bundle.putBoolean("com.google.android.apps.libraries.matchstick.action.hideReplyBox", cbht.f177180b);
                    bundle.putBoolean("com.google.android.apps.libraries.matchstick.action.showHintBar", cbht.f177181c);
                }
                cbhr cbhr = (cbhr) azol.m85935a((bxxk) cbhr.f177167i.mo74142c(7), a.getBlob(4));
                if (cbhr != null) {
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.themeColor", cbhr.f177169a);
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.incomingMessageFontColor", cbhr.f177170b);
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.outgoingMessageBackgroundColor", cbhr.f177171c);
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.outgoingMessageFontColor", cbhr.f177172d);
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.tombstoneMessageBackgroundColor", cbhr.f177174f);
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.tombstoneMessageFontColor", cbhr.f177175g);
                    bundle.putString("com.google.android.apps.libraries.matchstick.action.smartSuggestionColor", cbhr.f177176h);
                }
                bundle.putByteArray("com.google.android.apps.libraries.matchstick.action.stringTagMapping", a.getBlob(5));
            }
            a.close();
        }
        if (bundle != null) {
            intent2.putExtras(bundle);
        }
        intent2.addFlags(67108864);
        return intent2;
    }

    /* renamed from: a */
    public static PendingIntent m85918a(Context context, aznz aznz, Intent intent) {
        return PendingIntent.getActivity(context, aznz.f99774a.hashCode(), m85927b(context, aznz, intent), 134217728);
    }

    /* renamed from: a */
    public static PendingIntent m85919a(Context context, aznz aznz, Long l, boolean z, boolean z2, boolean z3) {
        if (l == null) {
            return null;
        }
        return PendingIntent.getService(context, aznz.f99774a.hashCode(), new Intent("com.google.android.apps.libraries.matchstick.action.NOTIFICATION_CLEARED").setClassName(context, "com.google.android.gms.matchstick.net.MessagingService").putExtra("conversation_id", aznz.f99774a).putExtra("last_msg_row_id", l).putExtra("should_show_reply_again", z).putExtra("has_new_messages", z2).putExtra("is_renotification", z3), 134217728);
    }

    /* renamed from: a */
    public static PendingIntent m85920a(Context context, aznz aznz, boolean z, Bundle bundle, Intent intent, bnhe bnhe, String str, boolean z2, boolean z3, boolean z4) {
        Intent intent2 = new Intent();
        if (!TextUtils.equals("BMMerchant", aznz.f99775b)) {
            intent2.putExtras(bundle);
            if (aznz.mo55104b()) {
                intent2.putExtra("group_name", azop.m85950a(context, aznz)).putExtra("message_activity_formatted_phone_numbers_map_extra", bnhe);
            }
        }
        intent2.putExtra("message_activity_conv_title_extra", str).putExtra("message_activity_is_reply_again", z3).putExtra("message_activity_has_new_messages_extra", z2).putExtra("is_renotification", z4);
        if (intent != null) {
            intent.putExtra("fall_back_intent", m85927b(context, aznz, intent2).toUri(1));
        } else {
            intent = intent2;
        }
        if (z) {
            intent.setAction("message_activity_invoke_mute_action");
            return m85918a(context, aznz, intent);
        } else if (intent.getBundleExtra("native_app_bundle") == null) {
            return m85918a(context, aznz, intent);
        } else {
            return PendingIntent.getService(context, aznz.f99774a.hashCode(), intent, 134217728);
        }
    }

    /* renamed from: a */
    public static Intent m85921a(Context context, azdd azdd) {
        cbig cbig;
        cbhj cbhj;
        cbil cbil = azoy.m85996l(azdd.mo54713b()) ? (cbil) azol.m85935a((bxxk) cbil.f177257h.mo74142c(7), azdd.mo54712a()) : null;
        if (cbil == null || (cbig = cbil.f177265g) == null || (cbhj = cbig.f177241b) == null || cbhj.f177136b.isEmpty()) {
            return null;
        }
        try {
            cbig cbig2 = cbil.f177265g;
            if (cbig2 == null) {
                cbig2 = cbig.f177238c;
            }
            cbhj cbhj2 = cbig2.f177241b;
            if (cbhj2 == null) {
                cbhj2 = cbhj.f177133d;
            }
            String str = cbhj2.f177136b;
            cbig cbig3 = cbil.f177265g;
            if (cbig3 == null) {
                cbig3 = cbig.f177238c;
            }
            cbhj cbhj3 = cbig3.f177241b;
            if (cbhj3 == null) {
                cbhj3 = cbhj.f177133d;
            }
            Intent.parseUri(str, cbhj3.f177137c);
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.FORWARD_TO_NATIVE_APP_INTENT");
            intent.setClassName(context, "com.google.android.gms.matchstick.net.MessagingService");
            Bundle bundle = new Bundle();
            Object[] objArr = new Object[1];
            cbig cbig4 = cbil.f177265g;
            if (cbig4 == null) {
                cbig4 = cbig.f177238c;
            }
            cbhj cbhj4 = cbig4.f177241b;
            if (cbhj4 == null) {
                cbhj4 = cbhj.f177133d;
            }
            objArr[0] = cbhj4.f177136b;
            cbig cbig5 = cbil.f177265g;
            if (cbig5 == null) {
                cbig5 = cbig.f177238c;
            }
            cbhj cbhj5 = cbig5.f177241b;
            if (cbhj5 == null) {
                cbhj5 = cbhj.f177133d;
            }
            bundle.putCharArray("native_app_uri", cbhj5.f177136b.toCharArray());
            cbig cbig6 = cbil.f177265g;
            if (cbig6 == null) {
                cbig6 = cbig.f177238c;
            }
            cbhj cbhj6 = cbig6.f177241b;
            if (cbhj6 == null) {
                cbhj6 = cbhj.f177133d;
            }
            int a = cbhi.m127856a(cbhj6.f177135a);
            if (a == 0) {
                a = 1;
            }
            if (a != 1) {
                bundle.putShort("native_app_type", (short) (a - 2));
                cbig cbig7 = cbil.f177265g;
                if (cbig7 == null) {
                    cbig7 = cbig.f177238c;
                }
                cbhj cbhj7 = cbig7.f177241b;
                if (cbhj7 == null) {
                    cbhj7 = cbhj.f177133d;
                }
                bundle.putShort("native_app_parsing_flag", (short) cbhj7.f177137c);
                intent.putExtra("native_app_bundle", bundle);
                intent.putExtra("conversation_id", azdd.mo54714c());
                return intent;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        } catch (URISyntaxException e) {
            Object[] objArr2 = new Object[1];
            cbig cbig8 = cbil.f177265g;
            if (cbig8 == null) {
                cbig8 = cbig.f177238c;
            }
            cbhj cbhj8 = cbig8.f177241b;
            if (cbhj8 == null) {
                cbhj8 = cbhj.f177133d;
            }
            objArr2[0] = cbhj8.f177136b;
            azoj.m85933c("IntentUtil", "Failed to parse message_intent.uri %s.", objArr2);
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m85922a(cbhj cbhj) {
        if (TextUtils.isEmpty(cbhj.f177136b)) {
            return null;
        }
        int a = cbhi.m127856a(cbhj.f177135a);
        if (a != 0 && a == 2) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(cbhj.f177136b, cbhj.f177137c);
            if (TextUtils.isEmpty(parseUri.getPackage())) {
                return null;
            }
            return parseUri;
        } catch (URISyntaxException e) {
            azoj.m85933c("IntentUtil", "Failed to parse uri %s", cbhj.f177136b);
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m85923a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str2, i);
            if (TextUtils.isEmpty(parseUri.getPackage())) {
                new Object[1][0] = str2;
                parseUri.setPackage(str);
            }
            return parseUri;
        } catch (URISyntaxException e) {
            azoj.m85933c("IntentUtil", "Failed to parse uri %s", str2);
            return null;
        }
    }

    /* renamed from: a */
    public static LocalEntityId m85924a(Intent intent) {
        String stringExtra = intent.getStringExtra("user_id");
        int intExtra = intent.getIntExtra("user_type", 0);
        String stringExtra2 = intent.getStringExtra("user_app_id");
        if (stringExtra != null && stringExtra2 != null && intExtra != 0) {
            return new LocalEntityId(stringExtra, intExtra, stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("conversation_id");
        aznz a = !TextUtils.isEmpty(stringExtra3) ? aznz.m85891a(stringExtra3) : null;
        if (a != null) {
            return a.f99780g;
        }
        return null;
    }

    /* renamed from: a */
    public static void m85925a(Context context, Intent intent, aznz aznz, String str, String str2, bxte bxte, List list, boolean z, String str3) {
        String str4;
        long j;
        cbjf cbjf;
        cbjh cbjh;
        cbjh cbjh2;
        Intent intent2 = intent;
        aznz aznz2 = aznz;
        bxte bxte2 = bxte;
        List list2 = list;
        boolean z2 = z;
        String str5 = str3;
        intent2.putExtra("message_activity_bot_id_extra", str);
        intent2.putExtra("message_activity_bot_name_extra", str);
        intent2.putExtra("message_activity_bot_intro_message_extra", str2);
        if (aznz2 != null) {
            str4 = aznz2.f99774a;
        } else {
            str4 = null;
        }
        intent2.putExtra("message_activity_conv_id", str4);
        intent2.putExtra("branding_app_id", "businessmessaging");
        if (!list.isEmpty()) {
            int size = list.size();
            bxvd da = cbiu.f177299c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            "conversation_starter_message_id".getClass();
            ((cbiu) da.f164949b).f177301a = "conversation_starter_message_id";
            for (int i = 0; i < size; i++) {
                bxvd da2 = cbit.f177293e.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cbit cbit = (cbit) da2.f164949b;
                cbit.f177297c = 0;
                cbit.f177298d = 1;
                bxvd da3 = cbiw.f177306c.mo74144da();
                if (cbbo.m127704a(((cbbp) list2.get(i)).f176600a) == 3) {
                    cbbp cbbp = (cbbp) list2.get(i);
                    if (cbbp.f176600a == 2) {
                        cbjf = (cbjf) cbbp.f176601b;
                    } else {
                        cbjf = cbjf.f177322b;
                    }
                    String str6 = cbjf.f177324a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cbiw cbiw = (cbiw) da3.f164949b;
                    str6.getClass();
                    cbiw.f177309b = str6;
                    "".getClass();
                    cbiw.f177308a = "";
                } else if (cbbo.m127704a(((cbbp) list2.get(i)).f176600a) == 4) {
                    cbbp cbbp2 = (cbbp) list2.get(i);
                    if (cbbp2.f176600a == 3) {
                        cbjh = (cbjh) cbbp2.f176601b;
                    } else {
                        cbjh = cbjh.f177327c;
                    }
                    String str7 = cbjh.f177330b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    str7.getClass();
                    ((cbiw) da3.f164949b).f177309b = str7;
                    cbbp cbbp3 = (cbbp) list2.get(i);
                    if (cbbp3.f176600a == 3) {
                        cbjh2 = (cbjh) cbbp3.f176601b;
                    } else {
                        cbjh2 = cbjh.f177327c;
                    }
                    String str8 = cbjh2.f177329a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    str8.getClass();
                    ((cbiw) da3.f164949b).f177308a = str8;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cbit cbit2 = (cbit) da2.f164949b;
                cbiw cbiw2 = (cbiw) da3.mo74062i();
                cbiw2.getClass();
                cbit2.f177296b = cbiw2;
                cbit2.f177295a = 3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbiu cbiu = (cbiu) da.f164949b;
                cbit cbit3 = (cbit) da2.mo74062i();
                cbit3.getClass();
                if (!cbiu.f177302b.mo73666a()) {
                    cbiu.f177302b = GeneratedMessageLite.m124021a(cbiu.f177302b);
                }
                cbiu.f177302b.add(cbit3);
            }
            intent2.putExtra("message_activity_conv_starters", ((cbiu) da.mo74062i()).serializeToBytes());
        }
        if (bxte2 != null) {
            bxvd da4 = cbim.f177266c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxte.getClass();
            ((cbim) da4.f164949b).f177268a = bxte2;
            intent2.putExtra("message_properties", ((cbim) da4.mo74062i()).serializeToBytes());
        }
        intent2.putExtra("show_log_consent", z2);
        if (z2) {
            j = Long.parseLong(cfeo.f183719a.mo6606a().mo81092u());
        } else {
            j = cfep.f183721a.mo6606a().mo80913a();
        }
        intent2.putExtra("prompt_string_id", j);
        if (aznz2 != null) {
            intent2.putExtra("message_activity_display_user_id", azot.m85962a(context, aznz2.f99779f));
        }
        if (cfdk.m138732b() && str5 != null) {
            intent2.putExtra("draft_message_type", "text/plain");
            intent2.putExtra("draft_message_content", str5);
        }
    }

    /* renamed from: a */
    public static void m85926a(Intent intent, LocalEntityId localEntityId) {
        if (localEntityId != null) {
            intent.putExtra("user_id", localEntityId.f111074a);
            intent.putExtra("user_type", localEntityId.f111075b);
            intent.putExtra("user_app_id", localEntityId.f111076c);
        }
    }
}
