package p000;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.personalized.PlaceUserData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: bioc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioc {
    /* renamed from: a */
    public static void m102645a(int i, String str, aenr aenr) {
        if (aenr != null) {
            try {
                aenr.mo34321a(str != null ? aemj.m52158b(i, str) : aemj.m52157b(i));
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: b */
    public static void m102650b(int i, List list, aenr aenr) {
        rtu a = DataHolder.m22537a(aeok.f63574c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) it.next();
            ContentValues contentValues = new ContentValues(aeok.f63574c.length);
            contentValues.put("ap_description", autocompletePredictionEntity.f79516a);
            contentValues.put("ap_place_id", autocompletePredictionEntity.f79517b);
            contentValues.put("ap_place_types", rtr.m34416a(autocompletePredictionEntity.f79518c));
            contentValues.put("ap_matched_subscriptions", rtr.m34417b(autocompletePredictionEntity.f79519d));
            contentValues.put("ap_personalization_type", Integer.valueOf(autocompletePredictionEntity.f79520e));
            contentValues.put("data", sef.m35074a(autocompletePredictionEntity));
            contentValues.put("ap_primary_text", autocompletePredictionEntity.f79521f);
            contentValues.put("ap_primary_text_matched", rtr.m34417b(autocompletePredictionEntity.f79522g));
            contentValues.put("ap_secondary_text", autocompletePredictionEntity.f79523h);
            contentValues.put("ap_secondary_text_matched", rtr.m34417b(autocompletePredictionEntity.f79524i));
            a.mo25160a(contentValues);
        }
        DataHolder a2 = a.mo25163a(i);
        try {
            aenr.mo34323b(a2);
        } catch (RemoteException e) {
            if (Log.isLoggable("Places", 4)) {
                bioi.m102659a("Places", "query suggestion callback failed", e);
            }
        } catch (Throwable th) {
            m102649a(aenr.asBinder(), a2);
            throw th;
        }
        m102649a(aenr.asBinder(), a2);
    }

    /* renamed from: c */
    public static void m102651c(int i, List list, aenr aenr) {
        rtu d = rts.m34440d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceUserData placeUserData = (PlaceUserData) it.next();
            if (placeUserData != null) {
                rts.m34439a(d, placeUserData);
            }
        }
        DataHolder a = d.mo25163a(i);
        try {
            aenr.mo34324c(a);
        } catch (RemoteException e) {
        } catch (Throwable th) {
            m102649a(aenr.asBinder(), a);
            throw th;
        }
        m102649a(aenr.asBinder(), a);
    }

    /* renamed from: a */
    public static void m102646a(int i, List list, int i2, aenr aenr) {
        rtu a = DataHolder.m22537a(aeok.f63573b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) it.next();
                a.mo25160a(placeLikelihoodEntity.mo43692c());
                linkedHashSet.addAll(placeLikelihoodEntity.f79558a.f79548n);
            }
        }
        Bundle bundle = new Bundle();
        String a2 = aemu.m52174a(linkedHashSet);
        if (!TextUtils.isEmpty(a2)) {
            aelr.m52132a(bundle, a2);
        }
        bundle.putInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", i2);
        DataHolder a3 = a.mo25164a(i, bundle);
        try {
            aenr.mo34322a(a3);
        } catch (RemoteException e) {
            if (Log.isLoggable("Places", 4)) {
                bioi.m102659a("Places", "places callback failed", e);
            }
        } catch (Throwable th) {
            m102649a(aenr.asBinder(), a3);
            throw th;
        }
        m102649a(aenr.asBinder(), a3);
    }

    /* renamed from: a */
    public static void m102647a(int i, List list, aeno aeno) {
        DataHolder dataHolder;
        Status b = aemj.m52157b(i);
        if (b.mo17710c()) {
            rtu a = DataHolder.m22537a(aeok.f63575d);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aeoh aeoh = (aeoh) it.next();
                ContentValues contentValues = new ContentValues(aeok.f63575d.length);
                contentValues.put("photo_fife_url", aeoh.f63564a);
                contentValues.put("photo_max_width", Integer.valueOf(aeoh.f63565b));
                contentValues.put("photo_max_height", Integer.valueOf(aeoh.f63566c));
                contentValues.put("photo_attributions", aeoh.f63567d.toString());
                a.mo25160a(contentValues);
            }
            dataHolder = a.mo25163a(i);
        } else {
            dataHolder = null;
        }
        try {
            aeno.mo34377a(new PlacePhotoMetadataResult(b, dataHolder));
            if (dataHolder == null) {
                return;
            }
        } catch (RemoteException e) {
            if (dataHolder == null) {
                return;
            }
        } catch (Throwable th) {
            if (dataHolder != null) {
                m102649a(aeno.asBinder(), dataHolder);
            }
            throw th;
        }
        m102649a(aeno.asBinder(), dataHolder);
    }

    /* renamed from: a */
    public static void m102648a(int i, List list, aenr aenr) {
        Bundle bundle;
        rtu a = DataHolder.m22537a(aeok.f63572a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceEntity placeEntity = (PlaceEntity) it.next();
            a.mo25160a(placeEntity.mo43688s());
            linkedHashSet.addAll(placeEntity.f79548n);
        }
        String a2 = aemu.m52174a(linkedHashSet);
        if (!TextUtils.isEmpty(a2)) {
            bundle = new Bundle();
            bundle.putString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY", a2);
        } else {
            bundle = null;
        }
        DataHolder a3 = a.mo25164a(i, bundle);
        try {
            aenr.mo34325d(a3);
        } catch (RemoteException e) {
            if (Log.isLoggable("Places", 4)) {
                bioi.m102659a("Places", "places callback failed", e);
            }
        } catch (Throwable th) {
            m102649a(aenr.asBinder(), a3);
            throw th;
        }
        m102649a(aenr.asBinder(), a3);
    }

    /* renamed from: a */
    public static void m102649a(IBinder iBinder, DataHolder dataHolder) {
        sdo.m34959a(dataHolder);
        if (iBinder != null) {
            try {
                if (iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor()) == null) {
                    dataHolder.close();
                }
            } catch (RemoteException e) {
                dataHolder.close();
            }
        }
    }
}
