package p000;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: jl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1109jl implements C1095iy {

    /* renamed from: a */
    public final Notification.Builder f22731a;

    /* renamed from: b */
    public final C1102je f22732b;

    /* renamed from: c */
    private final Bundle f22733c = new Bundle();

    public C1109jl(C1102je jeVar) {
        String str;
        int i;
        Bundle bundle;
        String str2;
        Bundle[] bundleArr;
        Icon icon;
        Bundle bundle2;
        C1102je jeVar2 = jeVar;
        new ArrayList();
        this.f22732b = jeVar2;
        int i2 = Build.VERSION.SDK_INT;
        this.f22731a = new Notification.Builder(jeVar2.f22249a, jeVar2.f22244B);
        Notification notification = jeVar2.f22247E;
        this.f22731a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(jeVar2.f22252d).setContentText(jeVar2.f22253e).setContentInfo(null).setContentIntent(jeVar2.f22254f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(jeVar2.f22255g, (notification.flags & 128) != 0).setLargeIcon(jeVar2.f22256h).setNumber(jeVar2.f22257i).setProgress(jeVar2.f22263o, jeVar2.f22264p, jeVar2.f22265q);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        this.f22731a.setSubText(jeVar2.f22262n).setUsesChronometer(jeVar2.f22260l).setPriority(jeVar2.f22258j);
        ArrayList arrayList = jeVar2.f22250b;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i5 >= size) {
                break;
            }
            C1099jb jbVar = (C1099jb) arrayList.get(i5);
            int i6 = Build.VERSION.SDK_INT;
            IconCompat a = jbVar.mo13558a();
            int i7 = Build.VERSION.SDK_INT;
            if (a != null) {
                icon = a.mo1113e();
            } else {
                icon = null;
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(icon, jbVar.f22070f, jbVar.f22071g);
            C1118ju[] juVarArr = jbVar.f22066b;
            if (juVarArr != null) {
                for (RemoteInput remoteInput : C1118ju.m17342a(juVarArr)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle3 = jbVar.f22065a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean(str, jbVar.f22067c);
            int i8 = Build.VERSION.SDK_INT;
            builder.setAllowGeneratedReplies(jbVar.f22067c);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i9 = Build.VERSION.SDK_INT;
            builder.setSemanticAction(0);
            int i10 = Build.VERSION.SDK_INT;
            builder.setContextual(false);
            bundle2.putBoolean("android.support.action.showsUserInterface", jbVar.f22068d);
            builder.addExtras(bundle2);
            this.f22731a.addAction(builder.build());
            i5++;
        }
        Bundle bundle4 = jeVar2.f22270v;
        if (bundle4 != null) {
            this.f22733c.putAll(bundle4);
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = Build.VERSION.SDK_INT;
        this.f22731a.setShowWhen(jeVar2.f22259k);
        int i13 = Build.VERSION.SDK_INT;
        int i14 = Build.VERSION.SDK_INT;
        this.f22731a.setLocalOnly(jeVar2.f22268t).setGroup(jeVar2.f22266r).setGroupSummary(jeVar2.f22267s).setSortKey(null);
        int i15 = Build.VERSION.SDK_INT;
        this.f22731a.setCategory(jeVar2.f22269u).setColor(jeVar2.f22271w).setVisibility(jeVar2.f22272x).setPublicVersion(jeVar2.f22273y).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = jeVar2.f22248F;
        int size2 = arrayList2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            this.f22731a.addPerson((String) arrayList2.get(i16));
        }
        if (jeVar2.f22251c.size() > 0) {
            Bundle bundle5 = jeVar.mo13615a().getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle();
            int i17 = 0;
            while (i17 < jeVar2.f22251c.size()) {
                String num = Integer.toString(i17);
                C1099jb jbVar2 = (C1099jb) jeVar2.f22251c.get(i17);
                Bundle bundle7 = new Bundle();
                IconCompat a2 = jbVar2.mo13558a();
                if (a2 != null) {
                    i = a2.mo1111c();
                } else {
                    i = 0;
                }
                bundle7.putInt("icon", i);
                bundle7.putCharSequence("title", jbVar2.f22070f);
                bundle7.putParcelable("actionIntent", jbVar2.f22071g);
                Bundle bundle8 = jbVar2.f22065a;
                if (bundle8 != null) {
                    bundle = new Bundle(bundle8);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, jbVar2.f22067c);
                bundle7.putBundle("extras", bundle);
                C1118ju[] juVarArr2 = jbVar2.f22066b;
                if (juVarArr2 != null) {
                    bundleArr = new Bundle[juVarArr2.length];
                    int i18 = 0;
                    while (i18 < juVarArr2.length) {
                        C1118ju juVar = juVarArr2[i18];
                        Bundle bundle9 = new Bundle();
                        String str3 = str;
                        C1118ju[] juVarArr3 = juVarArr2;
                        bundle9.putString("resultKey", juVar.f23213a);
                        bundle9.putCharSequence("label", juVar.f23214b);
                        bundle9.putCharSequenceArray("choices", juVar.f23215c);
                        boolean z = juVar.f23216d;
                        bundle9.putBoolean("allowFreeFormInput", true);
                        bundle9.putBundle("extras", juVar.f23217e);
                        Set<String> set = juVar.f23218f;
                        if (!set.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(set.size());
                            for (String str4 : set) {
                                arrayList3.add(str4);
                            }
                            bundle9.putStringArrayList("allowedDataTypes", arrayList3);
                        }
                        bundleArr[i18] = bundle9;
                        i18++;
                        str = str3;
                        juVarArr2 = juVarArr3;
                    }
                    str2 = str;
                } else {
                    str2 = str;
                    bundleArr = null;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", jbVar2.f22068d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i17++;
                str = str2;
            }
            bundle5.putBundle("invisible_actions", bundle6);
            jeVar.mo13615a().putBundle("android.car.EXTENSIONS", bundle5);
            this.f22733c.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i19 = Build.VERSION.SDK_INT;
        this.f22731a.setExtras(jeVar2.f22270v).setRemoteInputHistory(null);
        RemoteViews remoteViews = jeVar2.f22274z;
        if (remoteViews != null) {
            this.f22731a.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = jeVar2.f22243A;
        if (remoteViews2 != null) {
            this.f22731a.setCustomHeadsUpContentView(remoteViews2);
        }
        int i20 = Build.VERSION.SDK_INT;
        this.f22731a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(jeVar2.f22245C).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(jeVar2.f22244B)) {
            this.f22731a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i21 = Build.VERSION.SDK_INT;
        this.f22731a.setAllowSystemGeneratedContextualActions(jeVar2.f22246D);
        this.f22731a.setBubbleMetadata(null);
    }
}
