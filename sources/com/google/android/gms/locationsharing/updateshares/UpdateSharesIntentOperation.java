package com.google.android.gms.locationsharing.updateshares;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.util.Pair;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateSharesIntentOperation extends IntentOperation {
    /* renamed from: a */
    private static final Intent m67104a(String str, ArrayList arrayList, SharingCondition sharingCondition) {
        Intent intent = new Intent();
        intent.putExtra("account_name", str);
        ShareTarget.m67011a(arrayList, intent);
        if (sharingCondition != null) {
            sef.m35071a(sharingCondition, intent, "sharing_condition");
            boolean z = true;
            if (sharingCondition.mo43781c() != 1) {
                z = false;
            }
            intent.putExtra("is_persistent", z);
            if (!z) {
                intent.putExtra("duration", sharingCondition.mo43780b());
            }
        }
        return intent;
    }

    public final void onHandleIntent(Intent intent) {
        Intent intent2;
        int i;
        String str;
        ArrayList arrayList;
        Intent intent3;
        bzms bzms;
        Pair pair;
        ArrayList arrayList2;
        Intent intent4 = intent;
        String stringExtra = intent4.getStringExtra("account_name");
        boolean z = false;
        int a = bzmd.m125924a(intent4.getIntExtra("client_to_notify", 0));
        if (a == 0) {
            a = 1;
        }
        SharingCondition sharingCondition = (SharingCondition) sef.m35067a(intent4, "sharing_condition", SharingCondition.CREATOR);
        SharingCondition sharingCondition2 = (SharingCondition) sef.m35067a(intent4, "old_sharing_condition", SharingCondition.CREATOR);
        ArrayList a2 = ShareTarget.m67010a(intent);
        long j = 0;
        long longExtra = intent4.getLongExtra("journey_expiration_sec", 0);
        boolean booleanExtra = intent4.getBooleanExtra("enable_overwrite_all", false);
        boolean booleanExtra2 = intent4.getBooleanExtra("is_edit", false);
        int i2 = !booleanExtra2 ? a : 2;
        PendingIntent pendingIntent = (PendingIntent) intent4.getParcelableExtra("pending_intent");
        if (sharingCondition == null) {
            if (new aeub(stringExtra, this).mo34566a((ShareTarget) a2.get(0), sharingCondition2)) {
                arrayList = bnkn.m109665a(LocationShare.m66988a((ShareTarget) a2.get(0), sharingCondition2));
                str = null;
                i = 1;
                intent2 = null;
            } else {
                sharingCondition = sharingCondition2;
                arrayList = null;
                str = null;
                i = -1;
                intent2 = null;
            }
        } else if (sharingCondition.mo43781c() != 3) {
            PendingIntent pendingIntent2 = pendingIntent;
            arrayList = aeuf.m52559a(stringExtra, this, a2, sharingCondition, i2, !booleanExtra);
            i = !arrayList.isEmpty() ? 0 : -1;
            pendingIntent = pendingIntent2;
            str = null;
            intent2 = null;
        } else {
            SharingCondition.Destination destination = sharingCondition.f79645c;
            ArrayList arrayList3 = new ArrayList(a2.size());
            int size = a2.size();
            int i3 = 0;
            while (i3 < size) {
                long j2 = j;
                ShareTarget shareTarget = (ShareTarget) a2.get(i3);
                String c = shareTarget.mo43774c();
                bxvd da = bzlz.f170594d.mo74144da();
                bzly a3 = aexx.m52667a(shareTarget);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzlz bzlz = (bzlz) da.f164949b;
                a3.getClass();
                bzlz.f170597b = a3;
                int i4 = bzlz.f170596a | 1;
                bzlz.f170596a = i4;
                if (c != null) {
                    c.getClass();
                    bzlz.f170596a = i4 | 2;
                    bzlz.f170598c = c;
                }
                arrayList3.add((bzlz) da.mo74062i());
                i3++;
                j = j2;
                z = false;
            }
            aeub aeub = new aeub(stringExtra, this);
            bxvd da2 = bzmr.f170637g.mo74144da();
            bzmf a4 = aexp.m52655a(aeub.f63812c, aeub.f63811b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = z;
            }
            bzmr bzmr = (bzmr) da2.f164949b;
            a4.getClass();
            bzmr.f170644f = a4;
            bzmr.f170639a |= 64;
            if (!bzmr.f170640b.mo73666a()) {
                bzmr.f170640b = GeneratedMessageLite.m124021a(bzmr.f170640b);
            }
            bxsy.m123078a(arrayList3, bzmr.f170640b);
            bxvd da3 = bzln.f170550f.mo74144da();
            String str2 = destination.f79647a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = z;
            }
            bzln bzln = (bzln) da3.f164949b;
            str2.getClass();
            int i5 = bzln.f170552a | 1;
            bzln.f170552a = i5;
            bzln.f170553b = str2;
            bxvd bxvd = da2;
            long j3 = destination.f79650d;
            if (j3 != 0) {
                bzln.f170552a = i5 | 8;
                bzln.f170556e = j3;
            }
            if (destination.f79648b != null) {
                bxvd da4 = byul.f168303d.mo74144da();
                long j4 = destination.f79648b.f79651a;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                byul byul = (byul) da4.f164949b;
                int i6 = byul.f168305a | 1;
                byul.f168305a = i6;
                byul.f168306b = j4;
                long j5 = destination.f79648b.f79652b;
                byul.f168305a = i6 | 2;
                byul.f168307c = j5;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzln bzln2 = (bzln) da3.f164949b;
                byul byul2 = (byul) da4.mo74062i();
                byul2.getClass();
                bzln2.f170555d = byul2;
                bzln2.f170552a |= 4;
            } else if (destination.f79649c != null) {
                bxvd da5 = byum.f168308d.mo74144da();
                LatLng latLng = destination.f79649c;
                double d = latLng.f79894a;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byum byum = (byum) da5.f164949b;
                int i7 = byum.f168310a | 1;
                byum.f168310a = i7;
                byum.f168311b = d;
                double d2 = latLng.f79895b;
                byum.f168310a = i7 | 2;
                byum.f168312c = d2;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzln bzln3 = (bzln) da3.f164949b;
                byum byum2 = (byum) da5.mo74062i();
                byum2.getClass();
                bzln3.f170554c = byum2;
                bzln3.f170552a |= 2;
            }
            bzln bzln4 = (bzln) da3.mo74062i();
            bxvd bxvd2 = bxvd;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bzmr bzmr2 = (bzmr) bxvd2.f164949b;
            bzln4.getClass();
            bzmr2.f170641c = bzln4;
            bzmr2.f170639a |= 4;
            bxvd da6 = bzls.f170570c.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bzls bzls = (bzls) da6.f164949b;
            bzls.f170572a |= 4;
            bzls.f170573b = longExtra;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bzmr bzmr3 = (bzmr) bxvd2.f164949b;
            bzls bzls2 = (bzls) da6.mo74062i();
            bzls2.getClass();
            bzmr3.f170642d = bzls2;
            bzmr3.f170639a |= 8;
            bxvd da7 = bzme.f170605c.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bzme bzme = (bzme) da7.f164949b;
            bzme.f170608b = i2 - 1;
            bzme.f170607a |= 1;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bzmr bzmr4 = (bzmr) bxvd2.f164949b;
            bzme bzme2 = (bzme) da7.mo74062i();
            bzme2.getClass();
            bzmr4.f170643e = bzme2;
            bzmr4.f170639a |= 32;
            try {
                bzms = (bzms) aeub.mo34565a((bzmr) bxvd2.mo74062i(), bzms.f170645d, "createjourney");
            } catch (Exception e) {
                bqye.m113758a(e);
                bzms = null;
            }
            if (bzms != null) {
                Context context = aeub.f63812c;
                String str3 = aeub.f63811b;
                bzmb bzmb = bzms.f170649c;
                if (bzmb == null) {
                    bzmb = bzmb.f170600c;
                }
                aexp.m52656a(context, str3, bzmb);
                bzlt bzlt = bzms.f170647a;
                if (bzlt == null) {
                    bzlt = bzlt.f170574b;
                }
                String str4 = bzlt.f170576a;
                if (bzms.f170648b.size() != 0) {
                    arrayList2 = new ArrayList();
                    bxwc bxwc = bzms.f170648b;
                    int size2 = bxwc.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        bzlx bzlx = (bzlx) bxwc.get(i8);
                        Context context2 = aeub.f63812c;
                        bxvd bxvd3 = (bxvd) bzlx.mo74142c(5);
                        bxvd3.mo73625a((GeneratedMessageLite) bzlx);
                        LocationShare a5 = aexx.m52668a(context2, bxvd3, bzln4);
                        if (a5 != null) {
                            arrayList2.add(a5);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                pair = Pair.create(str4, arrayList2);
                intent2 = null;
            } else {
                intent2 = null;
                pair = Pair.create(null, null);
            }
            str = (String) pair.first;
            arrayList = (ArrayList) pair.second;
            i = arrayList != null ? 0 : -1;
        }
        if (pendingIntent != null) {
            if (i == -1) {
                intent3 = m67104a(stringExtra, a2, sharingCondition);
            } else {
                if (i == 0) {
                    if (!booleanExtra2) {
                        SmsManager smsManager = SmsManager.getDefault();
                        int size3 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size3) {
                                break;
                            }
                            LocationShare locationShare = (LocationShare) arrayList.get(i9);
                            AudienceMember b = locationShare.mo43755b();
                            if (b != null && aexk.m52648c(b)) {
                                if (getPackageManager().checkPermission("android.permission.SEND_SMS", getPackageName()) != 0) {
                                    m67105a(getString(C0126R.string.location_sharing_sms_permissions_error));
                                    break;
                                }
                                String string = getString(C0126R.string.location_sharing_share_text, new Object[]{locationShare.mo43758e()});
                                String formatNumber = PhoneNumberUtils.formatNumber(aexk.m52645a(b));
                                final String string2 = getResources().getString(C0126R.string.location_sharing_sms_error, formatNumber);
                                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.locationsharing.SMS_SENT_ACTION"), 0);
                                registerReceiver(new aacn("locationsharing") {
                                    /* class com.google.android.gms.locationsharing.updateshares.UpdateSharesIntentOperation.C16071 */

                                    /* renamed from: a */
                                    public final void mo6253a(Context context, Intent intent) {
                                        context.unregisterReceiver(this);
                                        if (getResultCode() != -1) {
                                            Toast.makeText(context, string2, 0).show();
                                        }
                                    }
                                }, new IntentFilter("com.google.android.gms.locationsharing.SMS_SENT_ACTION"));
                                smsManager.sendTextMessage(formatNumber, null, string, broadcast, null);
                                int i10 = Build.VERSION.SDK_INT;
                            }
                            i9++;
                        }
                    }
                    aetj.m52535a(this, stringExtra, true, sharingCondition.f79644b);
                }
                if (arrayList != null) {
                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                    int size4 = arrayList.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        arrayList4.add(((LocationShare) arrayList.get(i11)).f79627a);
                    }
                    intent3 = m67104a(stringExtra, arrayList4, sharingCondition);
                    sef.m35072a(arrayList, intent3, "target_location_shares");
                    intent3.putExtra("journey_id", str);
                } else {
                    intent3 = intent2;
                }
            }
            try {
                pendingIntent.send(this, i, intent3);
            } catch (PendingIntent.CanceledException e2) {
                bqye.m113758a(e2);
            }
        } else {
            throw new UnsupportedOperationException("You must pass a pending intent extra");
        }
    }

    /* renamed from: a */
    private final void m67105a(final String str) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.locationsharing.TOAST"), 0);
        registerReceiver(new aacn("locationsharing") {
            /* class com.google.android.gms.locationsharing.updateshares.UpdateSharesIntentOperation.C16082 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                context.unregisterReceiver(this);
                Toast.makeText(context, str, 0).show();
            }
        }, new IntentFilter("com.google.android.gms.locationsharing.TOAST"));
        try {
            broadcast.send(this, 0, new Intent());
        } catch (PendingIntent.CanceledException e) {
            bqye.m113758a(e);
        }
    }
}
