package com.google.android.places.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.userlocation.UserLocationNearbyLikelihood;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransformNearbyAlertIntentOperation extends IntentOperation {
    public TransformNearbyAlertIntentOperation() {
        this(new bifp(), new bidk());
    }

    /* renamed from: a */
    private final void m117735a(Intent intent) {
        avxc avxc;
        avxc avxc2;
        PendingIntent pendingIntent;
        String str;
        List list;
        int i;
        List<PlaceLikelihoodEntity> list2;
        Bundle bundle;
        Intent intent2 = intent;
        if (intent2 != null) {
            avxc = avxc.m79474a(intent2.getIntExtra("com.google.android.userlocation.extra.nearby_status", 8), sef.m35076b(intent2, "com.google.android.userlocation.extra.nearby_likelihoods", UserLocationNearbyLikelihood.CREATOR), intent2.getIntExtra("com.google.android.userlocation.extra.nearby_transition", 0));
        } else {
            avxc = null;
        }
        String str2 = "Places";
        if (avxc != null) {
            PendingIntent pendingIntent2 = (PendingIntent) intent2.getParcelableExtra("com.google.android.gms.userlocation.UserLocationNearbyAlertResult.LEGACY_CALL_INTENT_EXTRA");
            if (pendingIntent2 != null) {
                Intent intent3 = new Intent();
                if (intent2.hasExtra("nearby_alert_debug_data")) {
                    intent3.putExtras(intent2.getBundleExtra("nearby_alert_debug_data"));
                }
                int i2 = avxc.f94056c;
                int i3 = i2 != 1 ? i2 != 2 ? i2 != 4 ? -1 : ErrorInfo.TYPE_SDU_FAILED : ErrorInfo.TYPE_SDU_COMMUNICATIONERROR : 102;
                if (i3 != -1) {
                    int i4 = avxc.f94054a;
                    List list3 = avxc.f94055b;
                    if (list3 == null) {
                        list2 = Collections.emptyList();
                        avxc2 = avxc;
                        i = i4;
                    } else {
                        ArrayList arrayList = new ArrayList(list3.size());
                        int size = list3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            UserLocationNearbyLikelihood userLocationNearbyLikelihood = (UserLocationNearbyLikelihood) list3.get(i5);
                            arrayList.add(PlaceLikelihoodEntity.m66960a(bhpz.m101304a(userLocationNearbyLikelihood.f109598a, userLocationNearbyLikelihood.f109599b, userLocationNearbyLikelihood.f109600c, userLocationNearbyLikelihood.f109601d), 1.0f));
                            i5++;
                            avxc = avxc;
                            i4 = i4;
                        }
                        avxc2 = avxc;
                        i = i4;
                        list2 = arrayList;
                    }
                    rtu a = DataHolder.m22537a(aeok.f63573b);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (list2 != null) {
                        for (PlaceLikelihoodEntity placeLikelihoodEntity : list2) {
                            a.mo25160a(placeLikelihoodEntity.mo43692c());
                            linkedHashSet.addAll(placeLikelihoodEntity.f79558a.f79548n);
                        }
                    }
                    String a2 = aemu.m52174a(linkedHashSet);
                    if (!TextUtils.isEmpty(a2)) {
                        bundle = new Bundle();
                        aelr.m52132a(bundle, a2);
                    } else {
                        bundle = null;
                    }
                    aela aela = new aela(a.mo25164a(i, bundle), false, i3);
                    aela.mo34289a(intent3);
                    aela.mo12460c();
                } else {
                    avxc2 = avxc;
                }
                avxc avxc3 = avxc2;
                int i6 = avxc3.f94054a;
                List list4 = avxc3.f94055b;
                if (list4 == null) {
                    list = Collections.emptyList();
                    str = str2;
                    pendingIntent = pendingIntent2;
                } else {
                    ArrayList arrayList2 = new ArrayList(list4.size());
                    int size2 = list4.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        UserLocationNearbyLikelihood userLocationNearbyLikelihood2 = (UserLocationNearbyLikelihood) list4.get(i7);
                        arrayList2.add(NearbyLikelihoodEntity.m66937a(bhpz.m101304a(userLocationNearbyLikelihood2.f109598a, userLocationNearbyLikelihood2.f109599b, userLocationNearbyLikelihood2.f109600c, userLocationNearbyLikelihood2.f109601d), 1.0f));
                        i7++;
                        str2 = str2;
                        pendingIntent2 = pendingIntent2;
                    }
                    str = str2;
                    pendingIntent = pendingIntent2;
                    list = arrayList2;
                }
                aele aele = new aele(i6, list, avxc3.f94056c);
                ArrayList arrayList3 = new ArrayList(aele.mo24660a());
                Iterator it = aele.iterator();
                long j = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aeld aeld = (aeld) ((aeld) it.next()).mo7556bF();
                    if (aeld instanceof NearbyLikelihoodEntity) {
                        NearbyLikelihoodEntity nearbyLikelihoodEntity = (NearbyLikelihoodEntity) aeld;
                        j += (long) sef.m35074a(nearbyLikelihoodEntity).length;
                        if (j <= 400000) {
                            arrayList3.add(nearbyLikelihoodEntity);
                        } else if (Log.isLoggable("NearbyLikelihoodBuffer", 5)) {
                            Log.w("NearbyLikelihoodBuffer", String.format("Reached Binder size limit. Returned %d of %d results", Integer.valueOf(arrayList3.size()), Integer.valueOf(aele.mo24660a())));
                        }
                    }
                }
                sef.m35072a(arrayList3, intent3, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.PLACE_LIST_EXTRA_KEY");
                sef.m35071a(aele.f63483c, intent3, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.STATUS_EXTRA_KEY");
                intent3.putExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.TRANSITION_EXTRA_KEY", aele.f63482b);
                aele.mo12460c();
                PendingIntent pendingIntent3 = pendingIntent;
                try {
                    bidk.m102023a(this, intent3, pendingIntent3);
                } catch (PendingIntent.CanceledException e) {
                    PendingIntent.CanceledException canceledException = e;
                    String str3 = str;
                    if (Log.isLoggable(str3, 5)) {
                        String valueOf = String.valueOf(canceledException.getMessage());
                        Log.w(str3, valueOf.length() == 0 ? new String("CanceledException when sending intent: ") : "CanceledException when sending intent: ".concat(valueOf));
                    }
                    bifp.m102273a(this, "com.google.android.gms", null).mo64584b(pendingIntent3);
                }
            } else if (Log.isLoggable(str2, 5)) {
                Log.w(str2, "Received intent has no PendingIntent to use - ignoring it");
            }
        } else {
            String str4 = str2;
            if (Log.isLoggable(str4, 5)) {
                Log.w(str4, "Received intent has no result to use - ignoring it");
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.places.service.ACTION_NEARBY_ALERT_EVENT".equals(intent.getAction())) {
            m117735a(intent);
        } else if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("Places", valueOf.length() == 0 ? new String("Unable to handle intent with action ") : "Unable to handle intent with action ".concat(valueOf));
        }
    }

    public TransformNearbyAlertIntentOperation(bifp bifp, bidk bidk) {
    }
}
