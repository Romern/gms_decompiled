package p000;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: afeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afeh extends dck implements afei {
    public afeh() {
        super("com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: a */
    public final afia mo34796a(GroundOverlayOptions groundOverlayOptions) {
        return new afhz();
    }

    /* renamed from: a */
    public final void mo34799a(afem afem) {
    }

    /* renamed from: a */
    public final void mo34800a(afev afev) {
    }

    /* renamed from: a */
    public final void mo34801a(afey afey) {
    }

    /* renamed from: a */
    public final void mo34802a(affd affd) {
    }

    /* renamed from: a */
    public final void mo34803a(affn affn) {
    }

    /* renamed from: a */
    public final void mo34804a(affv affv) {
    }

    /* renamed from: a */
    public final void mo34805a(afga afga) {
    }

    /* renamed from: a */
    public final void mo34806a(vzr vzr) {
    }

    /* renamed from: a */
    public final void mo34807a(boolean z) {
    }

    /* renamed from: b */
    public final void mo34808b(vzr vzr) {
    }

    /* renamed from: c */
    public final void mo34809c() {
    }

    /* renamed from: d */
    public final Location mo34810d() {
        return new Location("null_provider");
    }

    /* renamed from: e */
    public final afgs mo34811e() {
        return new afgr();
    }

    /* renamed from: f */
    public final afgi mo34812f() {
        return new afgh();
    }

    /* renamed from: g */
    public final void mo34813g() {
    }

    /* renamed from: h */
    public final void mo34814h() {
    }

    /* renamed from: i */
    public final void mo34815i() {
    }

    /* renamed from: a */
    public final afig mo34797a(MarkerOptions markerOptions) {
        return new afif();
    }

    /* renamed from: a */
    public final CameraPosition mo34798a() {
        afgx a = CameraPosition.m67167a();
        a.f64239a = new LatLng(0.0d, 0.0d);
        return a.mo34834a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 44) {
            afic afic = new afic();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, afic);
            return true;
        } else if (i == 45) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                if (queryLocalInterface instanceof affg) {
                    affg affg = (affg) queryLocalInterface;
                } else {
                    new affg(readStrongBinder);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 51) {
            dcl.m8167a(parcel);
            parcel2.writeNoException();
            return true;
        } else if (i == 71) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                if (queryLocalInterface2 instanceof afgj) {
                    afgj afgj = (afgj) queryLocalInterface2;
                } else {
                    new afgj(readStrongBinder2);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 89) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IOnCircleClickListener");
                if (queryLocalInterface3 instanceof affe) {
                    affe affe = (affe) queryLocalInterface3;
                } else {
                    new affe(readStrongBinder3);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 107) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
                if (queryLocalInterface4 instanceof afgb) {
                    afgb afgb = (afgb) queryLocalInterface4;
                } else {
                    new afgb(readStrongBinder4);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 101) {
            parcel2.writeNoException();
            return true;
        } else if (i != 102) {
            switch (i) {
                case 1:
                    CameraPosition a = mo34798a();
                    parcel2.writeNoException();
                    dcl.m8169b(parcel2, a);
                    return true;
                case 2:
                    parcel2.writeNoException();
                    parcel2.writeFloat(1.0f);
                    return true;
                case 3:
                    parcel2.writeNoException();
                    parcel2.writeFloat(1.0f);
                    return true;
                case 4:
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface5 instanceof vzr) {
                            vzr vzr = (vzr) queryLocalInterface5;
                        } else {
                            new vzp(readStrongBinder5);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface6 instanceof vzr) {
                            vzr vzr2 = (vzr) queryLocalInterface6;
                        } else {
                            new vzp(readStrongBinder6);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface7 instanceof vzr) {
                            vzr vzr3 = (vzr) queryLocalInterface7;
                        } else {
                            new vzp(readStrongBinder7);
                        }
                    }
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                        if (queryLocalInterface8 instanceof afec) {
                            afec afec = (afec) queryLocalInterface8;
                        } else {
                            new afec(readStrongBinder8);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface9 instanceof vzr) {
                            vzr vzr4 = (vzr) queryLocalInterface9;
                        } else {
                            new vzp(readStrongBinder9);
                        }
                    }
                    parcel.readInt();
                    IBinder readStrongBinder10 = parcel.readStrongBinder();
                    if (readStrongBinder10 != null) {
                        IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                        if (queryLocalInterface10 instanceof afec) {
                            afec afec2 = (afec) queryLocalInterface10;
                        } else {
                            new afec(readStrongBinder10);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel2.writeNoException();
                    return true;
                case 9:
                    PolylineOptions polylineOptions = (PolylineOptions) dcl.m8163a(parcel, PolylineOptions.CREATOR);
                    afil afil = new afil();
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, afil);
                    return true;
                case 10:
                    PolygonOptions polygonOptions = (PolygonOptions) dcl.m8163a(parcel, PolygonOptions.CREATOR);
                    afii afii = new afii();
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, afii);
                    return true;
                case 11:
                    afig a2 = mo34797a((MarkerOptions) dcl.m8163a(parcel, MarkerOptions.CREATOR));
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, a2);
                    return true;
                case 12:
                    afia a3 = mo34796a((GroundOverlayOptions) dcl.m8163a(parcel, GroundOverlayOptions.CREATOR));
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, a3);
                    return true;
                case 13:
                    TileOverlayOptions tileOverlayOptions = (TileOverlayOptions) dcl.m8163a(parcel, TileOverlayOptions.CREATOR);
                    afio afio = new afio();
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, afio);
                    return true;
                case 14:
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 16:
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel2.writeNoException();
                    dcl.m8166a(parcel2, false);
                    return true;
                case 18:
                    dcl.m8167a(parcel);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel2.writeNoException();
                    dcl.m8166a(parcel2, false);
                    return true;
                case 20:
                    dcl.m8167a(parcel);
                    parcel2.writeNoException();
                    dcl.m8166a(parcel2, false);
                    return true;
                case 21:
                    parcel2.writeNoException();
                    dcl.m8166a(parcel2, false);
                    return true;
                case 22:
                    dcl.m8167a(parcel);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    Location d = mo34810d();
                    parcel2.writeNoException();
                    dcl.m8169b(parcel2, d);
                    return true;
                case 24:
                    IBinder readStrongBinder11 = parcel.readStrongBinder();
                    if (readStrongBinder11 != null) {
                        IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                        if (queryLocalInterface11 instanceof afem) {
                            afem afem = (afem) queryLocalInterface11;
                        } else {
                            new afek(readStrongBinder11);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 25:
                    afgs e = mo34811e();
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, e);
                    return true;
                case 26:
                    afgi f = mo34812f();
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, f);
                    return true;
                case 27:
                    IBinder readStrongBinder12 = parcel.readStrongBinder();
                    if (readStrongBinder12 != null) {
                        IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                        if (queryLocalInterface12 instanceof afev) {
                            afev afev = (afev) queryLocalInterface12;
                        } else {
                            new afet(readStrongBinder12);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 28:
                    IBinder readStrongBinder13 = parcel.readStrongBinder();
                    if (readStrongBinder13 != null) {
                        IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                        if (queryLocalInterface13 instanceof affn) {
                            affn affn = (affn) queryLocalInterface13;
                        } else {
                            new affl(readStrongBinder13);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 29:
                    IBinder readStrongBinder14 = parcel.readStrongBinder();
                    if (readStrongBinder14 != null) {
                        IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                        if (queryLocalInterface14 instanceof affp) {
                            affp affp = (affp) queryLocalInterface14;
                        } else {
                            new affp(readStrongBinder14);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 30:
                    IBinder readStrongBinder15 = parcel.readStrongBinder();
                    if (readStrongBinder15 != null) {
                        IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                        if (queryLocalInterface15 instanceof affv) {
                            affv affv = (affv) queryLocalInterface15;
                        } else {
                            new afft(readStrongBinder15);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 31:
                    IBinder readStrongBinder16 = parcel.readStrongBinder();
                    if (readStrongBinder16 != null) {
                        IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                        if (queryLocalInterface16 instanceof affw) {
                            affw affw = (affw) queryLocalInterface16;
                        } else {
                            new affw(readStrongBinder16);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 32:
                    IBinder readStrongBinder17 = parcel.readStrongBinder();
                    if (readStrongBinder17 != null) {
                        IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                        if (queryLocalInterface17 instanceof affh) {
                            affh affh = (affh) queryLocalInterface17;
                        } else {
                            new affh(readStrongBinder17);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 33:
                    IBinder readStrongBinder18 = parcel.readStrongBinder();
                    if (readStrongBinder18 != null) {
                        IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                        if (queryLocalInterface18 instanceof afej) {
                            afej afej = (afej) queryLocalInterface18;
                        } else {
                            new afej(readStrongBinder18);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 35:
                            CircleOptions circleOptions = (CircleOptions) dcl.m8163a(parcel, CircleOptions.CREATOR);
                            afhw afhw = new afhw();
                            parcel2.writeNoException();
                            dcl.m8164a(parcel2, afhw);
                            return true;
                        case 36:
                            IBinder readStrongBinder19 = parcel.readStrongBinder();
                            if (readStrongBinder19 != null) {
                                IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                                if (queryLocalInterface19 instanceof afga) {
                                    afga afga = (afga) queryLocalInterface19;
                                } else {
                                    new affy(readStrongBinder19);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        case FelicaException.TYPE_NOT_CLOSED:
                            IBinder readStrongBinder20 = parcel.readStrongBinder();
                            if (readStrongBinder20 != null) {
                                IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                                if (queryLocalInterface20 instanceof affx) {
                                    affx affx = (affx) queryLocalInterface20;
                                } else {
                                    new affx(readStrongBinder20);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                            IBinder readStrongBinder21 = parcel.readStrongBinder();
                            if (readStrongBinder21 != null) {
                                IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                                if (queryLocalInterface21 instanceof afgj) {
                                    afgj afgj2 = (afgj) queryLocalInterface21;
                                } else {
                                    new afgj(readStrongBinder21);
                                }
                            }
                            IBinder readStrongBinder22 = parcel.readStrongBinder();
                            if (readStrongBinder22 != null) {
                                IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                if (queryLocalInterface22 instanceof vzr) {
                                    vzr vzr5 = (vzr) queryLocalInterface22;
                                } else {
                                    new vzp(readStrongBinder22);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            parcel2.writeNoException();
                            return true;
                        case FelicaException.TYPE_PUSH_FAILED:
                            parcel2.writeNoException();
                            dcl.m8166a(parcel2, false);
                            return true;
                        case 41:
                            dcl.m8167a(parcel);
                            parcel2.writeNoException();
                            return true;
                        case FelicaException.TYPE_ALREADY_ACTIVATED:
                            IBinder readStrongBinder23 = parcel.readStrongBinder();
                            if (readStrongBinder23 != null) {
                                IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                                if (queryLocalInterface23 instanceof affo) {
                                    affo affo = (affo) queryLocalInterface23;
                                } else {
                                    new affo(readStrongBinder23);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 53:
                                    IBinder readStrongBinder24 = parcel.readStrongBinder();
                                    if (readStrongBinder24 != null) {
                                        IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                                        if (queryLocalInterface24 instanceof affs) {
                                            affs affs = (affs) queryLocalInterface24;
                                        } else {
                                            new affq(readStrongBinder24);
                                        }
                                    }
                                    parcel2.writeNoException();
                                    return true;
                                case 54:
                                    Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                                    parcel2.writeNoException();
                                    return true;
                                case 55:
                                    parcel2.writeNoException();
                                    return true;
                                case FelicaException.TYPE_ACTIVATE_FAILED:
                                    parcel2.writeNoException();
                                    return true;
                                case 57:
                                    parcel2.writeNoException();
                                    return true;
                                case FelicaException.TYPE_OFFLINE_CANCELED:
                                    parcel2.writeNoException();
                                    return true;
                                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                                    parcel2.writeNoException();
                                    dcl.m8166a(parcel2, false);
                                    return true;
                                case FelicaException.TYPE_MFC_NOT_FOUND:
                                    parcel2.writeNoException();
                                    dcl.m8169b(parcel2, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                                    return true;
                                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                    parcel.readString();
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    switch (i) {
                                        case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                                            IBinder readStrongBinder25 = parcel.readStrongBinder();
                                            if (readStrongBinder25 != null) {
                                                IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
                                                if (queryLocalInterface25 instanceof afgc) {
                                                    afgc afgc = (afgc) queryLocalInterface25;
                                                } else {
                                                    new afgc(readStrongBinder25);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 81:
                                            Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                                            parcel2.writeNoException();
                                            return true;
                                        case 82:
                                            parcel2.writeNoException();
                                            return true;
                                        case 83:
                                            IBinder readStrongBinder26 = parcel.readStrongBinder();
                                            if (readStrongBinder26 != null) {
                                                IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                                                if (queryLocalInterface26 instanceof afff) {
                                                    afff afff = (afff) queryLocalInterface26;
                                                } else {
                                                    new afff(readStrongBinder26);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 84:
                                            IBinder readStrongBinder27 = parcel.readStrongBinder();
                                            if (readStrongBinder27 != null) {
                                                IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                                                if (queryLocalInterface27 instanceof affj) {
                                                    affj affj = (affj) queryLocalInterface27;
                                                } else {
                                                    new affj(readStrongBinder27);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 85:
                                            IBinder readStrongBinder28 = parcel.readStrongBinder();
                                            if (readStrongBinder28 != null) {
                                                IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                                                if (queryLocalInterface28 instanceof afgd) {
                                                    afgd afgd = (afgd) queryLocalInterface28;
                                                } else {
                                                    new afgd(readStrongBinder28);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 86:
                                            IBinder readStrongBinder29 = parcel.readStrongBinder();
                                            if (readStrongBinder29 != null) {
                                                IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                                                if (queryLocalInterface29 instanceof affi) {
                                                    affi affi = (affi) queryLocalInterface29;
                                                } else {
                                                    new affi(readStrongBinder29);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 87:
                                            IBinder readStrongBinder30 = parcel.readStrongBinder();
                                            if (readStrongBinder30 != null) {
                                                IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                                                if (queryLocalInterface30 instanceof afge) {
                                                    afge afge = (afge) queryLocalInterface30;
                                                } else {
                                                    new afge(readStrongBinder30);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case 91:
                                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) dcl.m8163a(parcel, MapStyleOptions.CREATOR);
                                                    parcel2.writeNoException();
                                                    dcl.m8166a(parcel2, false);
                                                    return true;
                                                case 92:
                                                    parcel.readFloat();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 93:
                                                    parcel.readFloat();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 94:
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 95:
                                                    LatLngBounds latLngBounds = (LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                                                    IBinder readStrongBinder31 = parcel.readStrongBinder();
                                                    if (readStrongBinder31 != null) {
                                                        IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                                                        if (queryLocalInterface31 instanceof affd) {
                                                            affd affd = (affd) queryLocalInterface31;
                                                        } else {
                                                            new affb(readStrongBinder31);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 97:
                                                    IBinder readStrongBinder32 = parcel.readStrongBinder();
                                                    if (readStrongBinder32 != null) {
                                                        IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                                                        if (queryLocalInterface32 instanceof affa) {
                                                            affa affa = (affa) queryLocalInterface32;
                                                        } else {
                                                            new affa(readStrongBinder32);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 98:
                                                    IBinder readStrongBinder33 = parcel.readStrongBinder();
                                                    if (readStrongBinder33 != null) {
                                                        IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
                                                        if (queryLocalInterface33 instanceof afez) {
                                                            afez afez = (afez) queryLocalInterface33;
                                                        } else {
                                                            new afez(readStrongBinder33);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 99:
                                                    IBinder readStrongBinder34 = parcel.readStrongBinder();
                                                    if (readStrongBinder34 != null) {
                                                        IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                                                        if (queryLocalInterface34 instanceof afey) {
                                                            afey afey = (afey) queryLocalInterface34;
                                                        } else {
                                                            new afew(readStrongBinder34);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                default:
                                                    return false;
                                            }
                                    }
                            }
                    }
            }
        } else {
            parcel2.writeNoException();
            return true;
        }
    }
}
