package zooucat.currency

import java.util.Currency


/**
 * Type-safe constants for common ISO 4217 currencies.
 */
object Currencies {

    /**
     * South Korea won.
     *
     * Locations listed for this currency: South Korea
     */
    val KRW: Currency = Currency.getInstance("KRW")

    /**
     * United States dollar.
     *
     * Locations listed for this currency
     * - United States
     * - American Samoa
     * - British Indian Ocean Territory
     * - British Virgin Islands
     * - Bonaire, Sint Eustatius and Saba
     * - Ecuador
     * - El Salvador
     * - Guam
     * - Marshall Islands
     * - Federated States of Micronesia
     * - Northern Mariana Islands
     * - Palau
     * - Panama
     * - Puerto Rico
     * - Timor-Leste
     * - Turks and Caicos Islands
     * - U.S. Virgin Islands
     * - United States Minor Outlying Islands
     */
    val USD: Currency = Currency.getInstance("USD")

    /**
     * Euro.
     *
     * Locations listed for this currency
     * - Åland Islands
     * - Andorra
     * - Austria
     * - Belgium
     * - Croatia
     * - Cyprus
     * - Estonia
     * - European Union
     * - Finland
     * - France
     * - French Guiana
     * - French Southern and Antarctic Lands
     * - Germany
     * - Greece
     * - Guadeloupe
     * - Ireland
     * - Italy
     * - Kosovo
     * - Latvia
     * - Lithuania
     * - Luxembourg
     * - Malta
     * - Martinique
     * - Mayotte
     * - Monaco
     * - Montenegro
     * - Netherlands
     * - Portugal
     * - Réunion
     * - Saint Barthélemy
     * - Saint Martin
     * - Saint Pierre and Miquelon
     * - San Marino
     * - Slovakia
     * - Slovenia
     * - Spain
     * - Vatican City
     */
    val EUR: Currency = Currency.getInstance("EUR")

    /**
     * Japanese yen.
     *
     * Locations listed for this currency: South Korea
     */
    val JPY: Currency = Currency.getInstance("JPY")

    /**
     * Pound sterling.
     *
     * Locations listed for this currency
     * - United Kingdom
     * - Isle of Man
     * - Jersey
     * - Guernsey
     * - Tristan da Cunha
     */
    val GBP: Currency = Currency.getInstance("GBP")

    /**
     * Renminbi.
     *
     * Locations listed for this currency: China
     */
    val CNY: Currency = Currency.getInstance("CNY")

    /**
     * Australian dollar.
     *
     * Locations listed for this currency
     * - Australia
     * - Christmas Island
     * - Cocos (Keeling) Islands
     * - Heard Island and McDonald Islands
     * - Kiribati
     * - Nauru
     * - Norfolk Island
     * - Tuvalu
     */
    val AUD: Currency = Currency.getInstance("AUD")

    /**
     * Canadian dollar.
     *
     * Locations listed for this currency: Canada
     */
    val CAD: Currency = Currency.getInstance("CAD")

    /**
     * Swiss franc.
     *
     * Locations listed for this currency
     * - Switzerland
     * - Liechtenstein
     */
    val CHF: Currency = Currency.getInstance("CHF")

    /**
     * Swedish krona.
     *
     * Locations listed for this currency: Sweden
     */
    val SEK: Currency = Currency.getInstance("SEK")

    /**
     * New Zealand dollar.
     *
     * Locations listed for this currency
     * - New Zealand
     * - Cook Islands
     * - Niue
     * - Pitcairn Islands
     * - Tokelau
     */
    val NZD: Currency = Currency.getInstance("NZD")
}