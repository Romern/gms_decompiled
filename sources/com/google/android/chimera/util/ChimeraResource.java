package com.google.android.chimera.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Map;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraResource {

    /* renamed from: a */
    private static final Map f7693a = adyi.m51410a();

    private ChimeraResource() {
    }

    /* renamed from: a */
    private static int m4869a(ClassLoader classLoader, Resources resources, String str) {
        dnz dnz;
        Integer num;
        synchronized (f7693a) {
            dnz = (dnz) f7693a.get(classLoader);
            if (dnz == null) {
                String a = m4870a(classLoader, resources);
                if (a != null) {
                    dnz = new dnz(a);
                } else {
                    dnz = dnz.f13662c;
                }
                f7693a.put(classLoader, dnz);
            }
            if (dnz == dnz.f13662c) {
                dnz = null;
            }
        }
        if (dnz != null) {
            String str2 = dnz.f13663a;
            synchronized (dnz.f13664b) {
                num = (Integer) dnz.f13664b.get(str);
            }
            if (num != null) {
                return num.intValue();
            }
            try {
                Integer valueOf = Integer.valueOf(resources.getIdentifier(str, null, str2));
                synchronized (dnz.f13664b) {
                    dnz.f13664b.put(str, valueOf);
                }
                return valueOf.intValue();
            } catch (Resources.NotFoundException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + str2.length());
                sb.append("Unable to locate resource id for resourceName:");
                sb.append(str);
                sb.append(" and resourcePackage: ");
                sb.append(str2);
                Log.e("ChimeraResource", sb.toString(), e);
                throw e;
            }
        } else {
            throw new Resources.NotFoundException("Failed to get resource package name for module");
        }
    }

    public static int getResourceId(Context context, Resources resources, Resources resources2, int i) {
        return getResourceId(context.getApplicationContext().getClassLoader(), resources, resources2, i);
    }

    public static int getResourceId(ClassLoader classLoader, Resources resources, Resources resources2, int i) {
        String str;
        if (i == 0) {
            return 0;
        }
        try {
            String resourceName = resources2.getResourceName(i);
            if (resourceName.charAt(0) == '@') {
                resourceName = resourceName.substring(1);
            }
            int indexOf = resourceName.indexOf(58);
            if (indexOf != -1) {
                str = resourceName.substring(0, indexOf);
                resourceName = resourceName.substring(indexOf + 1);
            } else {
                str = null;
            }
            if (str == null || !str.equals("android")) {
                return m4869a(classLoader, resources, resourceName);
            }
            return i;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb = new StringBuilder(98);
            sb.append("Unable to load resource information for source themeId: ");
            sb.append(i);
            sb.append(". Module theme will not be set.");
            Log.e("ChimeraResource", sb.toString(), e);
            throw e;
        }
    }

    /* renamed from: a */
    private static String m4870a(ClassLoader classLoader, Resources resources) {
        try {
            try {
                try {
                    return resources.getResourcePackageName(classLoader.loadClass("com.google.android.chimeraresources.R$id").getField("chimera").getInt(0));
                } catch (Resources.NotFoundException e) {
                    Log.w("ChimeraResource", e.toString());
                    return null;
                }
            } catch (NoSuchFieldException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("The resource chimera could not be found: ");
                sb.append(valueOf);
                Log.e("ChimeraResource", sb.toString());
                return null;
            } catch (IllegalAccessException | IllegalArgumentException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                sb2.append("Failed to get resource ID for chimera: ");
                sb2.append(valueOf2);
                Log.e("ChimeraResource", sb2.toString());
                return null;
            }
        } catch (ClassNotFoundException e4) {
            return null;
        }
    }
}
